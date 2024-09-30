package supermarketapp.orders;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Order {

    @FXML
    private TableView<?> OrderTable;

    @FXML
    private TableColumn<?, ?> QuantityInStockColumn;

    @FXML
    private Button addButton;

    @FXML
    private TableColumn<?, ?> companyColumn;

    @FXML
    private ChoiceBox<?> companySelector;

    @FXML
    private Button deleteButton;

    @FXML
    private AnchorPane leftPane;

    @FXML
    private TableColumn<?, ?> nameColumn;

    @FXML
    private TextField nameTextfield;

    @FXML
    private TextField paidTextfield;

    @FXML
    private Button payButton;

    @FXML
    private TableColumn<?, ?> priceColumn;

    @FXML
    private ImageView productImage;

    @FXML
    private TableColumn<?, ?> productNameColumn;

    @FXML
    private TableView<?> productTable;

    @FXML
    private TableColumn<?, ?> quantityColumn;

    @FXML
    private TextField quantityTextField;

    @FXML
    private Button receiptButton;

    @FXML
    private Button resetButton;

    @FXML
    private Label restLabel;

    @FXML
    private AnchorPane rightPane;

    @FXML
    private AnchorPane root;

    @FXML
    private TableColumn<?, ?> totalColumn;

    @FXML
    private Label totalLabel;

    @FXML
    private TableColumn<?, ?> typeColumn;

    @FXML
    private ChoiceBox<?> typeSelector;

}
