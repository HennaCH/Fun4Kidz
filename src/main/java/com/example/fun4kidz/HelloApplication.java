package com.example.fun4kidz;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayDeque;

public class HelloApplication extends Application {

    private AddShape SHAPE;

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("My first application");
        primaryStage.setHeight(600);
        primaryStage.setWidth(900);
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();



        Group grp = new Group();
        HBox Shapes = new HBox();
        SHAPE = new AddShape();
        Group clearGrp = new Group();
        Scene scene = new Scene(grp);

        Label askname = new Label("What is your name ?");
        askname.setLayoutX(10);
        askname.setLayoutY(20);

        TextField getname =new TextField();
        getname.setLayoutX(10);
        getname.setLayoutY(40);

        Label answer = new Label();
        answer.setLayoutX(180);
        answer.setLayoutY(44);

        Button submit = new Button("Submit");

            submit.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                    if(getname.getText().equals("")){
                    clearGrp.getChildren().clear();
                    answer.setText("Hi !");
                    clearGrp.getChildren().add(answer);}
                    else {
                        clearGrp.getChildren().clear();
                        answer.setText("Hi " + getname.getText() + " !");
                        clearGrp.getChildren().add(answer);}
                    }

                });


        submit.setLayoutX(10);
        submit.setLayoutY(80);


        Button button1 = new Button("Car");
        button1.setLayoutX(10);
        button1.setLayoutY(120);
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                clearGrp.getChildren().clear();
                clearGrp.getChildren().addAll(SHAPE.rectCar(),SHAPE.circ1Car(),SHAPE.circ2Car(),
                                        SHAPE.rect2Car(), SHAPE.rect3Car());
            }
        });


        Button button2 = new Button("Flower");
        button2.setLayoutX(10);
        button2.setLayoutY(160);
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                clearGrp.getChildren().clear();
                clearGrp.getChildren().addAll( SHAPE.petal1(), SHAPE.petalDiag1(), SHAPE.petal2(), SHAPE.petalDiag2(),
                                          SHAPE.petal3(),SHAPE.petalDiag3(), SHAPE.petal4(), SHAPE.petalDiag4(),
                                          SHAPE.FlowerCenter(), SHAPE.petalCenter1(), SHAPE.petalCenter2(), SHAPE.petalCenter3());

            }
        });

        Button button3 = new Button("Butterfly");
        button3.setLayoutX(10);
        button3.setLayoutY(200);
        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                clearGrp.getChildren().clear();
                clearGrp.getChildren().addAll(SHAPE.bodyButterfly(), SHAPE.LeftWing1(),SHAPE.LeftWing2(),
                        SHAPE.RightWing1(),SHAPE.RightWing2());
            }
        });

        ColorPicker backgroundColor = new ColorPicker();
        backgroundColor.setLayoutX(10);
        backgroundColor.setLayoutY(240);
        backgroundColor.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Color Color =backgroundColor.getValue();
                scene.setFill(Color);
            }
        });

        grp.getChildren().addAll(button1, button2, button3, clearGrp,backgroundColor,
                                 askname, getname,submit);
                primaryStage.setScene(scene);
                primaryStage.show();
            }

            public static void main(String[] args) {
                launch();
            }

        }