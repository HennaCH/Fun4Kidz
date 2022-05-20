package com.example.fun4kidz;

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

    public Ellipse petal1(){
        Ellipse ellipse = new Ellipse();
        ellipse.setFill(Color.PALEGOLDENROD);
        ellipse.setCenterX(350.0f);
        ellipse.setCenterY(230.0f);
        ellipse.setRadiusX(100.0f);
        ellipse.setRadiusY(25.0f);
       /* for(int i=0; i <= 4; i++){
            Ellipse ellipsee = new Ellipse();
            ellipsee.setFill(Color.PALEGOLDENROD);
            ellipse.getCenterX();
            ellipsee.setCenterX();
            ellipsee.setCenterY(ellipse.getCenterY()-90);
            ellipsee.setRadiusX(100.0f);
            ellipsee.setRadiusY(25.0f);
            return ellipsee;
        }*/
        return ellipse;
    }
    public Ellipse petalDiag1(){
        Ellipse ellipseD1 = new Ellipse();
        ellipseD1.setFill(Color.PALEGOLDENROD);
        ellipseD1.setCenterX(400.0f);
        ellipseD1.setCenterY(-35.0f);
        ellipseD1.setRadiusX(100.0f);
        ellipseD1.setRadiusY(25.0f);
        Rotate rt = new Rotate();
        rt.setAngle(30);
        ellipseD1.getTransforms().add(rt);
        return ellipseD1;
    }

    public Ellipse petal2(){
        Ellipse ellipse2 = new Ellipse();
        ellipse2.setFill(Color.PALEGOLDENROD);
        ellipse2.setCenterX(450.0f);
        ellipse2.setCenterY(140.0f);
        ellipse2.setRadiusX(25.0f);
        ellipse2.setRadiusY(100.0f);
        return ellipse2;
    }
    public Ellipse petalDiag2(){
        Ellipse ellipseD2 = new Ellipse();
        ellipseD2.setFill(Color.PALEGOLDENROD);
        ellipseD2.setCenterX(380.0f);
        ellipseD2.setCenterY(415.0f);
        ellipseD2.setRadiusX(100.0f);
        ellipseD2.setRadiusY(25.0f);
        Rotate rt = new Rotate();
        rt.setAngle(-30);
        ellipseD2.getTransforms().add(rt);
        return ellipseD2;
    }

    public Ellipse petal3(){
        Ellipse ellipse3 = new Ellipse();
        ellipse3.setFill(Color.PALEGOLDENROD);
        ellipse3.setCenterX(550.0f);
        ellipse3.setCenterY(230.0f);
        ellipse3.setRadiusX(100.0f);
        ellipse3.setRadiusY(25.0f);
        return ellipse3;
    }
    public Ellipse petalDiag3(){
        Ellipse ellipseD3 = new Ellipse();
        ellipseD3.setFill(Color.PALEGOLDENROD);
        ellipseD3.setCenterX(170.0f);
        ellipseD3.setCenterY(430.0f);
        ellipseD3.setRadiusX(100.0f);
        ellipseD3.setRadiusY(25.0f);
        Rotate rt = new Rotate();
        rt.setAngle(-30);
        ellipseD3.getTransforms().add(rt);
        return ellipseD3;
    }
    public Ellipse petal4(){
        Ellipse ellipse4 = new Ellipse();
        ellipse4.setFill(Color.PALEGOLDENROD);
        ellipse4.setCenterX(450.0f);
        ellipse4.setCenterY(320.0f);
        ellipse4.setRadiusX(25.0f);
        ellipse4.setRadiusY(100.0f);
        return ellipse4;
    }
    public Ellipse petalDiag4(){
        Ellipse ellipseD4 = new Ellipse();
        ellipseD4.setFill(Color.PALEGOLDENROD);
        ellipseD4.setCenterX(600.0f);
        ellipseD4.setCenterY(-15.0f);
        ellipseD4.setRadiusX(100.0f);
        ellipseD4.setRadiusY(25.0f);
        Rotate rt = new Rotate();
        rt.setAngle(30);
        ellipseD4.getTransforms().add(rt);
        return ellipseD4;
    }

    public Circle FlowerCenter(){
        Circle centerCirc = new Circle();
        centerCirc.setFill(Color.LIGHTYELLOW);
        centerCirc.setRadius(50);
        centerCirc.setLayoutX(450);
        centerCirc.setLayoutY(230);
        return centerCirc;
    }

    public Ellipse petalCenter1(){
        Ellipse smallCenter1 = new Ellipse();
        smallCenter1.setFill(Color.NAVAJOWHITE);
        smallCenter1.setCenterX(450.0f);
        smallCenter1.setCenterY(230.0f);
        smallCenter1.setRadiusX(30.0f);
        smallCenter1.setRadiusY(20.0f);
        return smallCenter1;
    }
    public Ellipse petalCenter2(){
        Ellipse smallCenter1 = new Ellipse();
        smallCenter1.setFill(Color.NAVAJOWHITE);
        smallCenter1.setCenterX(450.0f);
        smallCenter1.setCenterY(230.0f);
        smallCenter1.setRadiusX(20.0f);
        smallCenter1.setRadiusY(30.0f);
        return smallCenter1;
    }
    public Circle petalCenter3(){
        Circle smallCenter3 = new Circle();
        smallCenter3.setFill(Color.PINK);
        smallCenter3.setRadius(10);
        smallCenter3.setLayoutX(450);
        smallCenter3.setLayoutY(230);
        return smallCenter3;
    }
}
