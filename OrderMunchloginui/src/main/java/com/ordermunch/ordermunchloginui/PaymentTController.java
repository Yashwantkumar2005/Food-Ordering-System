package com.ordermunch.ordermunchloginui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class PaymentTController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField cvvPasswordField;
    @FXML
    private TextField cardNameTextField;
    @FXML
    private TextField cardNumberTextField;
    @FXML
    private DatePicker dobDatePicker;
    @FXML
    private Label paymentLabel;

    public void PaymentButtonOnAction(ActionEvent event){

        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String nameonCard = cardNameTextField.getText();
        String cardNumber = cardNumberTextField.getText();
        String cvvNumber = cvvPasswordField.getText();

        try{
            Statement statement = connectDB.createStatement();
            String sql = "SELECT Card Holder Name FROM usercarddetails WHERE Card Holder Name = '" + nameonCard + "'";
            String sql1 = "SELECT Card Number FROM usercarddetails WHERE Card Number = '" + cardNumber + "'";
            String sql2 = "SELECT Card CVV FROM usercarddetails WHERE Card CVV = '" + cvvNumber + "'";
            ResultSet resultSet = statement.executeQuery(sql);
            ResultSet resultSet1 = statement.executeQuery(sql1);
            ResultSet resultSet2 = statement.executeQuery(sql2);
            if(resultSet.next()&&resultSet1.next()&&resultSet2.next()){
                paymentLabel.setText("Payment Success!");
            }
            else{
                paymentLabel.setText("Try Again!");
            }

        }
        catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }

}
