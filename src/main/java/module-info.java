module com.example.supermarketapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.supermarketapp to javafx.fxml;
    exports com.example.supermarketapp;
}