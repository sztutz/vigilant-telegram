package wholeworthsgrocery;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {
    
    @FXML
    private Label labelTotalCalculated;
    
    @FXML
    private void handleButtonCalculatePress(ActionEvent event) {
        labelTotalCalculated.setText("Hello Mother Fucker!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //TODO
    }
}
