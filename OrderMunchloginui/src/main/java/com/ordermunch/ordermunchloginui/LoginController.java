package com.ordermunch.ordermunchloginui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class LoginController {

    @FXML
    private Button cancelButton;
    @FXML
    private Label loginmessageLabel;
    @FXML
    private TextField usernameTextField;
    @FXML
    private Button verificationButton;
    @FXML
    private PasswordField passwordPasswordField;
    private Stage stage;
    private Scene scene;
    private Parent root;
    private String paint = "green";

    public void LoginButtonOnAction(ActionEvent e) {

        if (usernameTextField.getText().isBlank() && passwordPasswordField.getText().isBlank()) {
            loginmessageLabel.setText("Enter username and password");
        } else {
            if (usernameTextField.getText().isBlank()) {
                loginmessageLabel.setText("Enter username");
            } else if (passwordPasswordField.getText().isBlank()) {
                loginmessageLabel.setText("Enter password");
            } else {
                validateLogin();
            }
        }
    }

    public void CancelButtonOnAction(ActionEvent e) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void validateLogin(){
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String verifyLogin = "SELECT COUNT(1) FROM userslogindetails WHERE Username = '"+ usernameTextField.getText() +"' AND Password = '"+ passwordPasswordField.getText() +"'";

        try{

            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);

            while(queryResult.next()){
                if(queryResult.getInt(1) == 1){
                    loginmessageLabel.setText("Login Successful!");
                    verificationButton.setVisible(true);
                }
                else{
                    loginmessageLabel.setText("Wrong username or password");
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void switchtoMainMenu(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("mainmenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchtoRegisterMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("register.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
