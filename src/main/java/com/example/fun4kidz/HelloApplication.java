package com.example.fun4kidz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("My first application");
        primaryStage.setHeight(600);
        primaryStage.setWidth(900);
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();

        Group grp = new Group();
        Scene scene = new Scene(grp);
        Button button1 = new Button("Car");
        button1.setLayoutX(10);
        button1.setLayoutY(120);
        Button button2 = new Button("Flower");
        button2.setLayoutX(10);
        button2.setLayoutY(160);
        Button button3 = new Button("Butterfly");
        button3.setLayoutX(10);
        button3.setLayoutY(200);
        grp.getChildren().addAll(button1,button2,button3);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

        public static void main(String[] args) {
        launch();
    }

}