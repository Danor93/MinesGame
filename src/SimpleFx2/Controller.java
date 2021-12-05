package SimpleFx2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
	private int i=0; 
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Button1;

    @FXML
    private Button button2;

    @FXML
    private Label text;

    @FXML
    void PressOne(ActionEvent event) {
    	text.setText(""+i);
    	i++;
    }

    @FXML
    void PressTwo(ActionEvent event) {
    	text.setText(""+i);
    	i--;

    }

    @FXML
    void initialize() {
        assert Button1 != null : "fx:id=\"Button1\" was not injected: check your FXML file 'SecFXML.fxml'.";
        assert button2 != null : "fx:id=\"button2\" was not injected: check your FXML file 'SecFXML.fxml'.";
        assert text != null : "fx:id=\"text\" was not injected: check your FXML file 'SecFXML.fxml'.";

    }
}
