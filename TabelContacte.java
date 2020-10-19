package ro.elena.surveyapp1.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class TabelContacte extends Application {


    public static void main(String[] args) {
        launch (args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        Parent parent = FXMLLoader.load (new URL ("file:src/main/resources/templates/TabelContacte.fxml"));

        Scene scene = new Scene (parent);

        primaryStage.setScene (scene);

        primaryStage.show ();
    }

}