package vaniercollege.zyd;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * @author Yu Duo Zhang
 * https://github.com/zyd-074/Vanier_F25_420-SF3-RE_Lab07B.git
 */
public class Lab07B_YuDuoZhang extends Application{

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
        HBox btns = new HBox();
        
        // Object Creation
        Label title = new Label();
        Image[] images = new Image[20];
        ImageView imgView = new ImageView();
        Button play = new Button();
        Button speedPlus = new Button("Speed+");
        Button speedMinus = new Button("Speed-");
        
        // Layout Setup
        btns.getChildren().addAll(speedMinus, play, speedPlus);
        root.setCenter(middle);
        root.setBottom(btns);
        
        // Build Scene
        Scene scene = new Scene(root, 250, 300);
        stage.setScene(scene);
        stage.setTitle("Java Games");
        stage.show(); 
    }
}
