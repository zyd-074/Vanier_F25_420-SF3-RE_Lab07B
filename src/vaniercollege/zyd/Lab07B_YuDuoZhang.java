package vaniercollege.zyd;

import javafx.animation.*;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/**
 * @author Yu Duo Zhang
 * https://github.com/zyd-074/Vanier_F25_420-SF3-RE_Lab07B.git
 */
public class Lab07B_YuDuoZhang extends Application{
    static int counter = 0;

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
        StackPane display = new StackPane();
        HBox btns = new HBox();
        HBox titleDisplay = new HBox();
        
        // Object Creation
        Label title = new Label("Welcome To The Game");
        Image[] images = new Image[20];
        ImageView imgView = new ImageView();
        Button play = new Button();
        Button speedPlus = new Button("Speed+");
        Button speedMinus = new Button("Speed-");
        
        // Import all Images
        for (int i = 0; i < images.length; i++) {
            int imageNum = 101 + i;
            String imagePath = String.format("file:images/%d.jpg", imageNum);
            images[i] = new Image(imagePath);
        }

        // ImageView Animation
        FadeTransition restart = new FadeTransition();
        restart.setDuration(Duration.seconds(1));
        restart.setNode(imgView);
        FadeTransition changeImg = new FadeTransition();
        changeImg.setDuration(Duration.seconds(1));
        changeImg.setNode(imgView);
        restart.setFromValue(1);
        restart.setToValue(1);
        changeImg.setFromValue(1);
        changeImg.setToValue(1);
        
        restart.setOnFinished(e -> {
            changeImg.playFromStart();
        });
        
        changeImg.setOnFinished(e -> {
            imgView.setImage(images[counter]);
            counter = (counter += 1) % images.length;
            restart.playFromStart();
        });
        
        changeImg.play();
        
        // Layout Setup
        titleDisplay.getChildren().add(title);
        titleDisplay.setAlignment(Pos.CENTER);
        
        btns.getChildren().addAll(speedMinus, play, speedPlus);
        btns.setSpacing(15);
        btns.setAlignment(Pos.CENTER);
        
        display.getChildren().add(imgView);
        
        root.setTop(titleDisplay);
        root.setCenter(display);
        root.setBottom(btns);
        
        // Build Scene
        Scene scene = new Scene(root, 300, 375);
        stage.setScene(scene);
        stage.setTitle("Java Games");
        stage.show(); 
    }
}
