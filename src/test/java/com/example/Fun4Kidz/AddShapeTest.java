package com.example.Fun4Kidz;

import com.example.fun4kidz.AddShape;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddShapeTest {
    AddShape myTest = new AddShape();

    @BeforeEach
    void setUp() {
    }

    @Test
    public void rectCar() {

        assertEquals(Color.PINK,myTest.rectCar().getFill());
        assertEquals(300,myTest.rectCar().getWidth());
        assertEquals(200,myTest.rectCar().getHeight());
        assertEquals(290,myTest.rectCar().getLayoutX());
        assertEquals(150,myTest.rectCar().getLayoutY());
    }

    @Test
   public void circ1Car() {

        assertEquals(Color.LIGHTBLUE,myTest.circ1Car().getFill());
        assertEquals(40,myTest.circ1Car().getRadius());
        assertEquals(549,myTest.circ1Car().getLayoutX());
        assertEquals(370,myTest.circ1Car().getLayoutY());

    }

    @Test
   public void circ2Car() {

        assertEquals(Color.LIGHTBLUE,myTest.circ2Car().getFill());
        assertEquals(40,myTest.circ2Car().getRadius());
        assertEquals(330,myTest.circ2Car().getLayoutX());
        assertEquals(370,myTest.circ2Car().getLayoutY());
    }

    @Test
    public void rect2Car() {

        assertEquals(Color.PINK,myTest.rect2Car().getFill());
        assertEquals(100,myTest.rect2Car().getWidth());
        assertEquals(120,myTest.rect2Car().getHeight());
        assertEquals(590,myTest.rect2Car().getLayoutX());
        assertEquals(230,myTest.rect2Car().getLayoutY());
    }

    @Test
    public void rect3Car() {

        assertEquals(Color.LAVENDER,myTest.rect3Car().getFill());
        assertEquals(280,myTest.rect3Car().getWidth());
        assertEquals(90,myTest.rect3Car().getHeight());
        assertEquals(300,myTest.rect3Car().getLayoutX());
        assertEquals(160,myTest.rect3Car().getLayoutY());
    }

    @Test
    void petal1() {

        assertEquals(Color.PALEGOLDENROD,myTest.petal1().getFill());
        assertEquals(350.0f,myTest.petal1().getCenterX());
        assertEquals(230.0f,myTest.petal1().getCenterY());
        assertEquals(100.0f,myTest.petal1().getRadiusX());
        assertEquals(25.0f,myTest.petal1().getRadiusY());
    }

    @Test
    void petalDiag1() {

        assertEquals(Color.PALEGOLDENROD,myTest.petalDiag1().getFill());
        assertEquals(400.0f,myTest.petalDiag1().getCenterX());
        assertEquals(-35.0f,myTest.petalDiag1().getCenterY());
        assertEquals(100.0f,myTest.petalDiag1().getRadiusX());
        assertEquals(25.0f,myTest.petalDiag1().getRadiusY());
    }

    @Test
    void petal2() {

        assertEquals(Color.PALEGOLDENROD,myTest.petal2().getFill());
        assertEquals(450.0f,myTest.petal2().getCenterX());
        assertEquals(140.0f,myTest.petal2().getCenterY());
        assertEquals(25.0f,myTest.petal2().getRadiusX());
        assertEquals(100.0f,myTest.petal2().getRadiusY());
    }

    @Test
    void petalDiag2() {

        assertEquals(Color.PALEGOLDENROD,myTest.petalDiag2().getFill());
        assertEquals(380.0f,myTest.petalDiag2().getCenterX());
        assertEquals(415.0f,myTest.petalDiag2().getCenterY());
        assertEquals(100.0f,myTest.petalDiag2().getRadiusX());
        assertEquals(25.0f,myTest.petalDiag2().getRadiusY());
    }

    @Test
    void petal3() {

        assertEquals(Color.PALEGOLDENROD,myTest.petal3().getFill());
        assertEquals(550.0f,myTest.petal3().getCenterX());
        assertEquals(230.0f,myTest.petal3().getCenterY());
        assertEquals(100.0f,myTest.petal3().getRadiusX());
        assertEquals(25.0f,myTest.petal3().getRadiusY());
    }

    @Test
    void petalDiag3() {

        assertEquals(Color.PALEGOLDENROD,myTest.petalDiag3().getFill());
        assertEquals(170.0f,myTest.petalDiag3().getCenterX());
        assertEquals(430.0f,myTest.petalDiag3().getCenterY());
        assertEquals(100.0f,myTest.petalDiag3().getRadiusX());
        assertEquals(25.0f,myTest.petalDiag3().getRadiusY());
    }

    @Test
    void petal4() {

        assertEquals(Color.PALEGOLDENROD,myTest.petal4().getFill());
        assertEquals(450.0f,myTest.petal4().getCenterX());
        assertEquals(320.0f,myTest.petal4().getCenterY());
        assertEquals(25.0f,myTest.petal4().getRadiusX());
        assertEquals(100.0f,myTest.petal4().getRadiusY());
    }

    @Test
    void petalDiag4() {

        assertEquals(Color.PALEGOLDENROD,myTest.petalDiag4().getFill());
        assertEquals(600.0f,myTest.petalDiag4().getCenterX());
        assertEquals(-15.0f,myTest.petalDiag4().getCenterY());
        assertEquals(100.0f,myTest.petalDiag4().getRadiusX());
        assertEquals(25.0f,myTest.petalDiag4().getRadiusY());
    }

    @Test
    void flowerCenter() {

        assertEquals(Color.LIGHTYELLOW,myTest.FlowerCenter().getFill());
        assertEquals(50,myTest.FlowerCenter().getRadius());
        assertEquals(450,myTest.FlowerCenter().getLayoutX());
        assertEquals(230,myTest.FlowerCenter().getLayoutY());
    }

    @Test
    void petalCenter1() {

        assertEquals(Color.NAVAJOWHITE,myTest.petalCenter1().getFill());
        assertEquals(450.0f,myTest.petalCenter1().getCenterX());
        assertEquals(230.0f,myTest.petalCenter1().getCenterY());
        assertEquals(30.0f,myTest.petalCenter1().getRadiusX());
        assertEquals(20.0f,myTest.petalCenter1().getRadiusY());
    }

    @Test
    void petalCenter2() {

        assertEquals(Color.NAVAJOWHITE,myTest.petalCenter2().getFill());
        assertEquals(450.0f,myTest.petalCenter2().getCenterX());
        assertEquals(230.0f,myTest.petalCenter2().getCenterY());
        assertEquals(20.0f,myTest.petalCenter2().getRadiusX());
        assertEquals(30.0f,myTest.petalCenter2().getRadiusY());
    }

    @Test
    void petalCenter3() {

        assertEquals(Color.PINK,myTest.petalCenter3().getFill());
        assertEquals(10.0f,myTest.petalCenter3().getRadius());
        assertEquals(450.0f,myTest.petalCenter3().getLayoutX());
        assertEquals(230.0f,myTest.petalCenter3().getLayoutY());
    }

    @Test
    void bodyButterfly() {

        assertEquals(Color.BEIGE,myTest.bodyButterfly().getFill());
        assertEquals(450.0f,myTest.bodyButterfly().getCenterX());
        assertEquals(260.0f,myTest.bodyButterfly().getCenterY());
        assertEquals(10.0f,myTest.bodyButterfly().getRadiusX());
        assertEquals(110.0f,myTest.bodyButterfly().getRadiusY());
    }

    @Test
    void leftWing1(){

        assertEquals(Color.LIGHTBLUE,myTest.LeftWing1().getFill());
        assertEquals(390.0f,myTest.LeftWing1().getCenterX());
        assertEquals(-35.0f,myTest.LeftWing1().getCenterY());
        assertEquals(100.0f,myTest.LeftWing1().getRadiusX());
        assertEquals(25.0f,myTest.LeftWing1().getRadiusY());
    }

    @Test
    void leftWing2() {

        assertEquals(Color.DARKORANGE,myTest.LeftWing2().getFill());
        assertEquals(180.0f,myTest.LeftWing2().getCenterX());
        assertEquals(400.0f,myTest.LeftWing2().getCenterY());
        assertEquals(100.0f,myTest.LeftWing2().getRadiusX());
        assertEquals(40.0f,myTest.LeftWing2().getRadiusY());
    }

    @Test
    void rightWing1() {

        assertEquals(Color.LIGHTBLUE,myTest.RightWing1().getFill());
        assertEquals(385.0f,myTest.RightWing1().getCenterX());
        assertEquals(425.0f,myTest.RightWing1().getCenterY());
        assertEquals(100.0f,myTest.RightWing1().getRadiusX());
        assertEquals(25.0f,myTest.RightWing1().getRadiusY());
    }

    @Test
    void rightWing2() {

        assertEquals(Color.DARKORANGE,myTest.RightWing2().getFill());
        assertEquals(603.0f,myTest.RightWing2().getCenterX());
        assertEquals(-50.0f,myTest.RightWing2().getCenterY());
        assertEquals(100.0f,myTest.RightWing2().getRadiusX());
        assertEquals(40.0f,myTest.RightWing2().getRadiusY());
    }
}