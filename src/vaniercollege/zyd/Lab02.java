package vaniercollege.zyd;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

/**
 * @author Yu Duo Zhang
 */
public class Lab02 extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        TextField textField = new TextField();
        HBox hb = new HBox(textField);
        Scene scene = new Scene(hb, 300, 300);
        stage.setScene(scene);
        stage.show();
    }
    
}
