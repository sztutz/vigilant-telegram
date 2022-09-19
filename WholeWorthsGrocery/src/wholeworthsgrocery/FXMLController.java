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
    void buttonCalculateOnAction(ActionEvent event) {
        int eggsQty = Integer.parseInt(textFieldEggsQty.getText());
        int milkQty = Integer.parseInt(textFieldMilkQty.getText());
        int breadQty = Integer.parseInt(textFieldBreadQty.getText());
        
        double eggsItemTotal = (eggsQty / 12 * 5.0) + (eggsQty % 12 * 0.5);
        double milkTotal = (milkQty / 3 * 7.0) + (milkQty % )
        
        labelEggsItemTotal.setText(String.valueOf(eggsItemTotal));
    }

}
