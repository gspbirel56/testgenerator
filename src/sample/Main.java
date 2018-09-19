package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Test Generator: Alpha");
        primaryStage.setScene(new Scene(root, 500, 425));
        //I want a fixed window size
        primaryStage.setMaxHeight(425);
        primaryStage.setMinHeight(425);
        primaryStage.setMaxWidth(500);
        primaryStage.setMinWidth(500);

        //I also want to disable the maximize button

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
