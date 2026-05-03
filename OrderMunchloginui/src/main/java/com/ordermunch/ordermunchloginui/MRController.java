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

public class MRController {

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

    public void addChalupas(ActionEvent event) throws IOException{
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String zingquan = "UPDATE cartdetails SET quantity = quantity + 1 WHERE FoodID = 19";
        String zingamount = "UPDATE cartdetails SET amount = 300*quantity WHERE FoodID = 19";
        try{

            Statement statement = connectDB.createStatement();
            int queryResult = statement.executeUpdate(zingquan);
            int queryResult2 = statement.executeUpdate(zingamount);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void addFlautas(ActionEvent event) throws IOException{
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String zingquan = "UPDATE cartdetails SET quantity = quantity + 1 WHERE FoodID = 20";
        String zingamount = "UPDATE cartdetails SET amount = 400*quantity WHERE FoodID = 20";
        try{

            Statement statement = connectDB.createStatement();
            int queryResult = statement.executeUpdate(zingquan);
            int queryResult2 = statement.executeUpdate(zingamount);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void addMole(ActionEvent event) throws IOException{
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String zingquan = "UPDATE cartdetails SET quantity = quantity + 1 WHERE FoodID = 21";
        String zingamount = "UPDATE cartdetails SET amount = 150*quantity WHERE FoodID = 21";
        try{

            Statement statement = connectDB.createStatement();
            int queryResult = statement.executeUpdate(zingquan);
            int queryResult2 = statement.executeUpdate(zingamount);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void addConcrema(ActionEvent event) throws IOException{
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String zingquan = "UPDATE cartdetails SET quantity = quantity + 1 WHERE FoodID = 22";
        String zingamount = "UPDATE cartdetails SET amount = 170*quantity WHERE FoodID = 22";
        try{

            Statement statement = connectDB.createStatement();
            int queryResult = statement.executeUpdate(zingquan);
            int queryResult2 = statement.executeUpdate(zingamount);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void addPico(ActionEvent event) throws IOException{
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String zingquan = "UPDATE cartdetails SET quantity = quantity + 1 WHERE FoodID = 23";
        String zingamount = "UPDATE cartdetails SET amount = 200*quantity WHERE FoodID = 23";
        try{

            Statement statement = connectDB.createStatement();
            int queryResult = statement.executeUpdate(zingquan);
            int queryResult2 = statement.executeUpdate(zingamount);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void addSopes(ActionEvent event) throws IOException{
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String zingquan = "UPDATE cartdetails SET quantity = quantity + 1 WHERE FoodID = 24";
        String zingamount = "UPDATE cartdetails SET amount = 220*quantity WHERE FoodID = 24";
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
