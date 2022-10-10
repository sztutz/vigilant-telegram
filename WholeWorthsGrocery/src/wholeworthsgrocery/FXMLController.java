package wholeworthsgrocery;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private Label labelBreadItemTotal;

    @FXML
    private Label labelEggsItemTotal;

    @FXML
    private Label labelMilkItemTotal;

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
        int eggsQty;
        int milkQty;
        int breadQty;        
        
        try {
            if(!textFieldEggsQty.getText().isEmpty()) {
                eggsQty = Integer.parseInt(textFieldEggsQty.getText());
            }
            else {
                eggsQty = 0;
            }
            if(!textFieldMilkQty.getText().isEmpty()) {
                milkQty = Integer.parseInt(textFieldMilkQty.getText());
            }
            else {
                milkQty = 0;
            }
            if(!textFieldBreadQty.getText().isEmpty()) {
                breadQty = Integer.parseInt(textFieldBreadQty.getText());
            }
            else {
                breadQty = 0;
            }

        double eggsItemTotal = (eggsQty / 12 * 5.0) + (eggsQty % 12 * 0.5);
        double milkItemTotal = (milkQty / 3 * 7.0) + (milkQty % 3 * 2.5);
        double breadItemTotal = (breadQty / 2 * 6.0) + (breadQty % 2 * 3.5);
        
        labelEggsItemTotal.setText("$" + String.valueOf(eggsItemTotal));
        labelMilkItemTotal.setText("$" + String.valueOf(milkItemTotal));
        labelBreadItemTotal.setText("$" + String.valueOf(breadItemTotal));
        
        double totalCalculated = eggsItemTotal + milkItemTotal + breadItemTotal;
        
        labelTotalCalculated.setText("$" + String.valueOf(totalCalculated));
        
        }
        catch (NumberFormatException e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Input Error");
            alert.setHeaderText("Input Error");
            alert.setContentText("Quantity must be an integer");
            alert.showAndWait().ifPresent(rs -> {
                if (rs == ButtonType.OK) {
                    System.out.println("Pressed OK.");
                }
            });
        }
    }

}
