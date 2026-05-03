package com.ordermunch.ordermunchloginui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class CartMenuController implements Initializable {

    @FXML
    private AnchorPane hamburgerAnchorPane;

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TableView<CartMenuTableModel> table;
    @FXML
    private TableColumn<CartMenuTableModel, String> foodName;
    @FXML
    private TableColumn<CartMenuTableModel, String> quantity;
    @FXML
    private TableColumn<CartMenuTableModel, String> amount;
    @FXML
    private Label sumLabel;

    ObservableList<CartMenuTableModel> listview = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        foodName.setCellValueFactory(new PropertyValueFactory<>("FoodName"));
        quantity.setCellValueFactory(new PropertyValueFactory<>("Quantity"));
        amount.setCellValueFactory(new PropertyValueFactory<>("Amount"));

        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();
        try{
            String sql = "SELECT FoodName,Quantity,Amount FROM cartdetails WHERE Quantity>0";
            Statement s = connectDB.createStatement();
            ResultSet r = s.executeQuery(sql);

            while(r.next()){
                listview.add(new CartMenuTableModel(
                        r.getString("FoodName"),
                        r.getString("Quantity"),
                        r.getString("Amount")
                ));
            }
            table.setItems(listview);
        }
        catch(Exception e){

        }

    }

    public void removeAllButton(ActionEvent event){
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String zingquan = "UPDATE cartdetails SET quantity = 0";
        String zingamount = "UPDATE cartdetails SET amount = 0";
        try{

            Statement statement = connectDB.createStatement();
            int queryResult = statement.executeUpdate(zingquan);
            int queryResult2 = statement.executeUpdate(zingamount);
            root = FXMLLoader.load(getClass().getResource("cartmenu.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void refreshOnAction(ActionEvent event){
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String totalamt = "SELECT SUM(Amount) as Total FROM cartdetails";
        try{

            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(totalamt);
            root = FXMLLoader.load(getClass().getResource("cartmenu.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        sumLabel.setText("Total: 2");
    }

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

    public void switchtoPaymentDetails(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("paymentmenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
