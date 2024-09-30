package supermarketapp.products;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Product {

    @FXML
    private TableColumn<?, ?> IDcolumn;

    @FXML
    private TextField IDtextfield;

    @FXML
    private ImageView ProductImage;

    @FXML
    private TableView<?> ProductTable;

    @FXML
    private Button addButton;

    @FXML
    private TableColumn<?, ?> companyColumn;

    @FXML
    private TextField companyTextField;

    @FXML
    private Button deleteButton;

    @FXML
    private Button imageButton;

    @FXML
    private AnchorPane leftPane;

    @FXML
    private TableColumn<?, ?> nameColumn;

    @FXML
    private TextField originalPrice;

    @FXML
    private TableColumn<?, ?> originalPriceColumn;

    @FXML
    private TextField productNameTextfield;

    @FXML
    private TextField quantity;

    @FXML
    private TableColumn<?, ?> quantityColumn;

    @FXML
    private Button resetButton;

    @FXML
    private AnchorPane rightPane;

    @FXML
    private AnchorPane root;

    @FXML
    private TextField salePrice;

    @FXML
    private TableColumn<?, ?> salePriceColumn;

    @FXML
    private Button searchButton;

    @FXML
    private TextField searchTextfield;

    @FXML
    private TableColumn<?, ?> typeColumn;

    @FXML
    private ChoiceBox<?> typeSelector;

    @FXML
    private Button updateButton;

}
