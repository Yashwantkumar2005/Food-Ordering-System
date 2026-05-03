package com.ordermunch.ordermunchloginui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

public class CRController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private AnchorPane hamburgerAnchorPane;

    public void HamburgerMenuButtonAction(ActionEvent event)  throws IOException{
        hamburgerAnchorPane.setVisible(true);
    }

    public void switchtoMainMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("mainmenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchtoCartMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("cartmenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchtoTrackMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("trackmenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchtoContactMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("contactmenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchtoHelpMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("helpmenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void switchtoLoginMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void addCharsiu(ActionEvent event) throws IOException{
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String zingquan = "UPDATE cartdetails SET quantity = quantity + 1 WHERE FoodID = 13";
        String zingamount = "UPDATE cartdetails SET amount = 300*quantity WHERE FoodID = 13";
        try{

            Statement statement = connectDB.createStatement();
            int queryResult = statement.executeUpdate(zingquan);
            int queryResult2 = statement.executeUpdate(zingamount);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void addChowMein(ActionEvent event) throws IOException{
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String zingquan = "UPDATE cartdetails SET quantity = quantity + 1 WHERE FoodID = 14";
        String zingamount = "UPDATE cartdetails SET amount = 400*quantity WHERE FoodID = 14";
        try{

            Statement statement = connectDB.createStatement();
            int queryResult = statement.executeUpdate(zingquan);
            int queryResult2 = statement.executeUpdate(zingamount);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void addKungPao(ActionEvent event) throws IOException{
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String zingquan = "UPDATE cartdetails SET quantity = quantity + 1 WHERE FoodID = 15";
        String zingamount = "UPDATE cartdetails SET amount = 150*quantity WHERE FoodID = 15";
        try{

            Statement statement = connectDB.createStatement();
            int queryResult = statement.executeUpdate(zingquan);
            int queryResult2 = statement.executeUpdate(zingamount);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void addSpringRoll(ActionEvent event) throws IOException{
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String zingquan = "UPDATE cartdetails SET quantity = quantity + 1 WHERE FoodID = 16";
        String zingamount = "UPDATE cartdetails SET amount = 170*quantity WHERE FoodID = 16";
        try{

            Statement statement = connectDB.createStatement();
            int queryResult = statement.executeUpdate(zingquan);
            int queryResult2 = statement.executeUpdate(zingamount);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void addPork(ActionEvent event) throws IOException{
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String zingquan = "UPDATE cartdetails SET quantity = quantity + 1 WHERE FoodID = 17";
        String zingamount = "UPDATE cartdetails SET amount = 200*quantity WHERE FoodID = 17";
        try{

            Statement statement = connectDB.createStatement();
            int queryResult = statement.executeUpdate(zingquan);
            int queryResult2 = statement.executeUpdate(zingamount);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void addWonton(ActionEvent event) throws IOException{
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String zingquan = "UPDATE cartdetails SET quantity = quantity + 1 WHERE FoodID = 18";
        String zingamount = "UPDATE cartdetails SET amount = 220*quantity WHERE FoodID = 18";
        try{

            Statement statement = connectDB.createStatement();
            int queryResult = statement.executeUpdate(zingquan);
            int queryResult2 = statement.executeUpdate(zingamount);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
