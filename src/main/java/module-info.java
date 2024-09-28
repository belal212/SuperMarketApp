module com.example.supermarketapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens supermarketapp to javafx.fxml;
    exports supermarketapp;
    exports supermarketapp.orders;
    opens supermarketapp.orders to javafx.fxml;
}