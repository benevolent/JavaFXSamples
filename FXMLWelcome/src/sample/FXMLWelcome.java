package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created with IntelliJ IDEA.
 * User: mikio
 * Date: 13/06/06
 * Time: 21:06
 * To change this template use File | Settings | File Templates.
 */
public class FXMLWelcome extends Application{

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("fxml_welcome.fxml"));

        primaryStage.setTitle("FXML Welcome");
        primaryStage.setScene(new Scene(root,300,275));
        primaryStage.show();
    }
}
