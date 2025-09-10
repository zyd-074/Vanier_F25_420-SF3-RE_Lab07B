package vaniercollege.zyd;

import javafx.application.Application;
import javafx.geometry.Pos;
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
        BorderPane root = new BorderPane();
        StackPane middle = new StackPane();
        
        Label title = new Label("Random Game");
        Label bottom = new Label("Waiting...");
        Label lblImage = new Label();
        
        
        root.setTop(title);
        root.setBottom(bottom);
        middle.getChildren().add(lblImage);
        root.setCenter(middle);
        
        Scene scene = new Scene(root, 250, 300);
        stage.setScene(scene);
        stage.setTitle("Java Games");
        stage.show();
    }
    
}
