package com.ordermunch.ordermunchloginui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.io.IOException;

public class HelpMenuController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField queryTextField;
    @FXML
    private AnchorPane hamburgerAnchorPane;
    @FXML
    public BorderPane mainmenuBorderPane;

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

    public void switchtoRestaurantsMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("restaurantsmenu.fxml"));
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

    public void enterQueryButton(ActionEvent event) throws IOException{
        queryTextField.setText("");
    }

}
