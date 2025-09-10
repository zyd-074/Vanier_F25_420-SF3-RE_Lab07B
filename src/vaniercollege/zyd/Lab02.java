package vaniercollege.zyd;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.image.*;
import java.util.Random;

/**
 * @author Yu Duo Zhang
 * 2025/09/10
 * https://github.com/Cloumy074/Lab02-F25.git
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
        // Building Layout
        BorderPane root = new BorderPane();
        StackPane middle = new StackPane();
        
        // Object Creation
        Label title = new Label("Random Game");
        Label bottom = new Label("Waiting...");
        Label lblImage = new Label();

        // Random Image impliment
        int imageNum = new Random().nextInt(20) + 101;
        String imagePath = String.format("file:images/%d.jpg", imageNum);
        Image img = new Image(imagePath);
        lblImage.setGraphic(new ImageView(img));
        
        // Layout Setup
        root.setTop(title);
        root.setBottom(bottom);
        middle.getChildren().add(lblImage);
        root.setCenter(middle);
        
        // Build Scene
        Scene scene = new Scene(root, 250, 300);
        stage.setScene(scene);
        stage.setTitle("Java Games");
        stage.show(); 
    }
    
}
