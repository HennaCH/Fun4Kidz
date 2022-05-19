package com.example.fun4kidz;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class AddShape {

    public Shape rectCar() {
        Rectangle rect = new Rectangle();
        rect.setFill(Color.PINK);
        rect.setWidth(300);
        rect.setHeight(200);
        rect.setLayoutX(290);
        rect.setLayoutY(150);
        return rect;
    }
    public Shape circ1Car(){
        Circle circ1 = new Circle();
        circ1.setFill(Color.LIGHTBLUE);
        circ1.setRadius(40);
        circ1.setLayoutX(400);
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
}
