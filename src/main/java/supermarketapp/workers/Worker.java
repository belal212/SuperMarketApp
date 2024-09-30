package supermarketapp.workers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Worker {

    @FXML
    private TableColumn<?, ?> SalaryColumn;

    @FXML
    private Button addButton;

    @FXML
    private Button deleteButton;

    @FXML
    private TableColumn<?, ?> idColumn;

    @FXML
    private TextField idTextfield;

    @FXML
    private ImageView image;

    @FXML
    private AnchorPane leftPane;

    @FXML
    private TableColumn<?, ?> nameColumn;

    @FXML
    private Button resetButton;

    @FXML
    private AnchorPane rightPane;

    @FXML
    private AnchorPane root;

    @FXML
    private TextField salaryTextField;

    @FXML
    private Button searchButton;

    @FXML
    private TextField searchTextfield;

    @FXML
    private Button updateButton;

    @FXML
    private Button uploadButton;

    @FXML
    private TextField workerNameTextfield;

    @FXML
    private TableView<?> workerTable;

}
