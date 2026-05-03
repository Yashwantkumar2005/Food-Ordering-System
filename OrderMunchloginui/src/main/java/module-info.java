module com.ordermunch.ordermunchloginui {

    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;
    requires mysql.connector.j;
    requires java.desktop;


    opens com.ordermunch.ordermunchloginui to javafx.fxml;
    exports com.ordermunch.ordermunchloginui;
}