package com.example.fun4kidz;

import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.transform.Rotate;

import java.util.ArrayDeque;

public class AddShape {
    private ArrayDeque<Shape> shapes = new ArrayDeque<Shape>();

    public Shape rectCar() {
        Rectangle rect = new Rectangle();
        rect.setFill(Color.PINK);
        rect.setWidth(300);
        rect.setHeight(200);
        rect.setLayoutX(290);
        rect.setLayoutY(150);
        return rect ;
    }
    public Shape circ1Car(){
        Circle circ1 = new Circle();
        circ1.setFill(Color.LIGHTBLUE);
        circ1.setRadius(40);
        circ1.setLayoutX(549);
        circ1.setLayoutY(370);
        return circ1;
    }
    public Circle circ2Car() {
        Circle circ2 = new Circle();
        circ2.setFill(Color.LIGHTBLUE);
        circ2.setRadius(40);
        circ2.setLayoutX(330);
        circ2.setLayoutY(370);
        return circ2;
    }
    public Rectangle rect2Car(){
        Rectangle rect2 = new Rectangle();
        rect2.setFill(Color.PINK);
        rect2.setWidth(100);
        rect2.setHeight(120);
        rect2.setLayoutX(590);
        rect2.setLayoutY(230);
        return rect2;
    }
    public Rectangle rect3Car(){
        Rectangle rect3 = new Rectangle();
        rect3.setFill(Color.LAVENDER);
        rect3.setWidth(280);
        rect3.setHeight(90);
        rect3.setLayoutX(300);
        rect3.setLayoutY(160);
        return rect3;
    }

    public Circle FlowerCenter(){
        Circle centerCirc = new Circle();
        centerCirc.setFill(Color.LIGHTYELLOW);
        centerCirc.setRadius(100);
        centerCirc.setLayoutX(450);
        centerCirc.setLayoutY(230);
        return centerCirc;
    }

    public Ellipse petal1(){
    Ellipse ellipse = new Ellipse();
        ellipse.setFill(Color.PALEGOLDENROD);
        ellipse.setCenterX(310.0f);
        ellipse.setCenterY(230.0f);
        ellipse.setRadiusX(50.0f);
        ellipse.setRadiusY(25.0f);
        return ellipse;
    }

    public Ellipse petal2(){
        Ellipse ellipse = new Ellipse();
        ellipse.setFill(Color.PALEGOLDENROD);
        ellipse.setCenterX(310.0f);
        ellipse.setCenterY(230.0f);
        ellipse.setRadiusX(50.0f);
        ellipse.setRadiusY(25.0f);
        Rotate rotate = new Rotate();
        //rotate.setAngle(30);
        ellipse.getTransforms().add(rotate);
        return ellipse;
    }


}
