package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

/**
 * Created with IntelliJ IDEA.
 * User: mikio
 * Date: 13/06/08
 * Time: 17:26
 * To change this template use File | Settings | File Templates.
 */
public class FXMLWelcomeController {
    @FXML private Text actiontarget;

    @FXML protected void handleSubmitButtonAction(ActionEvent event){
        actiontarget.setText("Sign in button pressed");
    }
}
