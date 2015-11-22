package org.dimigo.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by WOF on 2015. 11. 19..
 */
public class HelloWorldMain2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("HelloWorld.fxml"));

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
