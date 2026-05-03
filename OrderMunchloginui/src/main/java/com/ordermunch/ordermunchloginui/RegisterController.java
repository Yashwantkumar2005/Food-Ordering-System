package com.ordermunch.ordermunchloginui;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RegisterController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Button cancelButton;
    @FXML
    private Label registersuccessLabel;
    @FXML
    private Label passwordnotmatchLabel;
    @FXML
    private TextField passwordPasswordField;
    @FXML
    private TextField confirmpasswordPasswordField;
    @FXML
    private TextField firstNameTextField;
    @FXML
    private TextField lastNameTextField;
    @FXML
    private TextField usernameTextField;

    public void switchtoLoginMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void CancelButtonOnAction(ActionEvent e) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
        Platform.exit();
    }

    public void RegisterButtonOnAction(){

        if(passwordPasswordField.getText().equals(confirmpasswordPasswordField.getText())){
            RegisterUser();
            passwordnotmatchLabel.setText("");
        }
        else{
            passwordnotmatchLabel.setText("Passwords do not match!");
            registersuccessLabel.setText("Please Try Again");
        }
    }

    public void RegisterUser(){

        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String firstName = firstNameTextField.getText();
        String lastName = lastNameTextField.getText();
        String username = usernameTextField.getText();
        String password = passwordPasswordField.getText();

        String insertFields = "INSERT INTO userslogindetails(firstName, lastName, username, password) VALUES ('";
        String insertValues = firstName + "','" + lastName + "','" + username + "','" + password + "')";
        String insertToRegister = insertFields + insertValues;

        try{
            Statement statement = connectDB.createStatement();
            String sql = "SELECT username FROM userslogindetails WHERE username = '" + username + "'";
            ResultSet resultSet = statement.executeQuery(sql);
            if(resultSet.next()){
                registersuccessLabel.setText("Username already exists!");
            }
            else {
                registersuccessLabel.setText("Registration Successful!");
                statement.executeUpdate(insertToRegister);
            }
        }
        catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }

}
