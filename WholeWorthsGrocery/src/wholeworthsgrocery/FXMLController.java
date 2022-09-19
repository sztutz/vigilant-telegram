package wholeworthsgrocery;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private Button buttonCalculate;

    @FXML
    private Label labelBread;

    @FXML
    private Label labelBreadItemTotal;

    @FXML
    private Label labelEggs;

    @FXML
    private Label labelEggsItemTotal;

    @FXML
    private Label labelItemTotal;

    @FXML
    private Label labelMilk;

    @FXML
    private Label labelMilkItemTotal;

    @FXML
    private Label labelQuantity;

    @FXML
    private Label labelTotal;

    @FXML
    private Label labelTotalCalculated;

    @FXML
    private TextField textFieldBreadQty;

    @FXML
    private TextField textFieldEggsQty;

    @FXML
    private TextField textFieldMilkQty;

    @FXML
    void handleButtonAction(ActionEvent event) {
        labelTotalCalculated.setText("Hello Mother Fucker");
    }

}
