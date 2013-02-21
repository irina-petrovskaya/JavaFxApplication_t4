package sample;

/*import javafx.collections.ObservableMap;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;*/

import javafx.collections.ObservableMap;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/*import javafx.fxml.FXML;*/

public class Controller {
    public Button b1;
    public Label topLabel;
    @FXML
    TextField tf;
    public void sayHello(ActionEvent event) {
       ObservableMap props = b1.getProperties();
        String txt = (String) props.get("pp1");
       topLabel.setText(txt);
    }

    public void passTxt(ActionEvent actionEvent) {
       topLabel.setText(tf.getText());
    }
}
