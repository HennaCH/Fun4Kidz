package com.example.Fun4Kidz;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddShapeTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void rectCar() {
        Rectangle r1 = new Rectangle();
        r1.setFill(Color.PINK);
        r1.setWidth(300);

        Rectangle rect = new Rectangle();
        rect.setFill(Color.PINK);
        rect.setWidth(300);

        assertEquals(r1.getWidth(),rect.getWidth());
    }

    @Test
    void circ1Car() {
        Circle c1 = new Circle();
        c1.setFill(Color.LIGHTBLUE);
        c1.setRadius(40);

        Circle circ1 = new Circle();
        circ1.setFill(Color.LIGHTBLUE);
        circ1.setRadius(40);

        assertEquals(c1.getRadius(),circ1.getRadius());
    }

    @Test
    void circ2Car() {
        Circle c2 = new Circle();
        c2.setFill(Color.LIGHTBLUE);
        c2.setRadius(40);

        Circle circ2 = new Circle();
        circ2.setFill(Color.LIGHTBLUE);
        circ2.setRadius(40);

        assertEquals(c2.getRadius(),circ2.getRadius());
    }

    @Test
    void rect2Car() {
        Rectangle r2 = new Rectangle();
        r2.setFill(Color.PINK);
        r2.setWidth(100);

        Rectangle rect2 = new Rectangle();
        rect2.setFill(Color.PINK);
        rect2.setWidth(100);

        assertEquals(r2.getWidth(),rect2.getWidth());
    }

    @Test
    void rect3Car() {
        Rectangle r3 = new Rectangle();
        r3.setFill(Color.LAVENDER);
        r3.setWidth(280);

        Rectangle rect3 = new Rectangle();
        rect3.setFill(Color.LAVENDER);
        rect3.setWidth(280);

        assertEquals(r3.getWidth(),rect3.getWidth());
    }

    @Test
    void petal1() {
        Ellipse e1 = new Ellipse();
        e1.setFill(Color.PALEGOLDENROD);
        e1.setCenterX(350.0f);

        Ellipse ellipse = new Ellipse();
        ellipse.setFill(Color.PALEGOLDENROD);
        ellipse.setCenterX(350.0f);

        assertEquals(e1.getCenterX(),ellipse.getCenterX());
    }

    @Test
    void petalDiag1() {
        Ellipse ed1 = new Ellipse();
        ed1.setFill(Color.PALEGOLDENROD);
        ed1.setCenterX(400.0f);

        Ellipse ellipseD1 = new Ellipse();
        ellipseD1.setFill(Color.PALEGOLDENROD);
        ellipseD1.setCenterX(400.0f);

        assertEquals(ed1.getCenterX(),ellipseD1.getCenterX());
    }

    @Test
    void petal2() {
        Ellipse e2 = new Ellipse();
        e2.setFill(Color.PALEGOLDENROD);
        e2.setCenterX(450.0f);

        Ellipse ellipse2 = new Ellipse();
        ellipse2.setFill(Color.PALEGOLDENROD);
        ellipse2.setCenterX(450.0f);

        assertEquals(e2.getCenterX(),ellipse2.getCenterX());
    }

    @Test
    void petalDiag2() {
        Ellipse ed2 = new Ellipse();
        ed2.setFill(Color.PALEGOLDENROD);
        ed2.setCenterX(380.0f);

        Ellipse ellipseD2 = new Ellipse();
        ellipseD2.setFill(Color.PALEGOLDENROD);
        ellipseD2.setCenterX(380.0f);

        assertEquals(ed2.getCenterX(),ellipseD2.getCenterX());
    }

    @Test
    void petal3() {
        Ellipse e3 = new Ellipse();
        e3.setFill(Color.PALEGOLDENROD);
        e3.setCenterX(550.0f);

        Ellipse ellipse3 = new Ellipse();
        ellipse3.setFill(Color.PALEGOLDENROD);
        ellipse3.setCenterX(550.0f);

        assertEquals(e3.getCenterX(),ellipse3.getCenterX());
    }

    @Test
    void petalDiag3() {
        Ellipse ed3 = new Ellipse();
        ed3.setFill(Color.PALEGOLDENROD);
        ed3.setCenterX(170.0f);

        Ellipse ellipseD3 = new Ellipse();
        ellipseD3.setFill(Color.PALEGOLDENROD);
        ellipseD3.setCenterX(170.0f);

        assertEquals(ed3.getCenterX(),ellipseD3.getCenterX());
    }

    @Test
    void petal4() {
        Ellipse e4 = new Ellipse();
        e4.setFill(Color.PALEGOLDENROD);
        e4.setCenterX(450.0f);

        Ellipse ellipse4 = new Ellipse();
        ellipse4.setFill(Color.PALEGOLDENROD);
        ellipse4.setCenterX(450.0f);

        assertEquals(e4.getCenterX(),ellipse4.getCenterX());
    }

    @Test
    void petalDiag4() {
        Ellipse ed4 = new Ellipse();
        ed4.setFill(Color.PALEGOLDENROD);
        ed4.setCenterX(600.0f);

        Ellipse ellipseD4 = new Ellipse();
        ellipseD4.setFill(Color.PALEGOLDENROD);
        ellipseD4.setCenterX(600.0f);

        assertEquals(ed4.getCenterX(),ellipseD4.getCenterX());
    }

    @Test
    void flowerCenter() {
        Circle cC = new Circle();
        cC.setFill(Color.LIGHTYELLOW);
        cC.setRadius(50);

        Circle centerCirc = new Circle();
        centerCirc.setFill(Color.LIGHTYELLOW);
        centerCirc.setRadius(50);

        assertEquals(cC.getRadius(),centerCirc.getRadius());
    }

    @Test
    void petalCenter1() {
        Ellipse sC1= new Ellipse();
        sC1.setFill(Color.NAVAJOWHITE);
        sC1.setCenterX(450.0f);

        Ellipse smallCenter1 = new Ellipse();
        smallCenter1.setFill(Color.NAVAJOWHITE);
        smallCenter1.setCenterX(450.0f);

        assertEquals(sC1.getCenterX(), smallCenter1.getCenterX());
    }

    @Test
    void petalCenter2() {
        Ellipse sC2= new Ellipse();
        sC2.setFill(Color.NAVAJOWHITE);
        sC2.setCenterX(450.0f);

        Ellipse smallCenter2 = new Ellipse();
        smallCenter2.setFill(Color.NAVAJOWHITE);
        smallCenter2.setCenterX(450.0f);

        assertEquals(sC2.getCenterX(), smallCenter2.getCenterX());
    }

    @Test
    void petalCenter3() {
        Circle sC3 = new Circle();
        sC3.setFill(Color.PINK);
        sC3.setRadius(10);

        Circle smallCenter3 = new Circle();
        smallCenter3.setFill(Color.PINK);
        smallCenter3.setRadius(10);

        assertEquals(sC3.getRadius(), smallCenter3.getRadius());
    }

    @Test
    void bodyButterfly() {
        Ellipse b = new Ellipse();
        b.setFill(Color.BEIGE);
        b.setCenterX(450.0f);

        Ellipse body = new Ellipse();
        body.setFill(Color.BEIGE);
        body.setCenterX(450.0f);

        assertEquals(b.getCenterX(), body.getCenterX());
    }

    @Test
    void leftWing1() {
        Ellipse w1 = new Ellipse();
        w1.setFill(Color.LIGHTBLUE);
        w1.setCenterX(390.0f);

        Ellipse wing1 = new Ellipse();
        wing1.setFill(Color.LIGHTBLUE);
        wing1.setCenterX(390.0f);
        assertEquals(w1.getCenterX(), wing1.getCenterX());
    }

    @Test
    void leftWing2() {
        Ellipse w2 = new Ellipse();
        w2.setFill(Color.DARKORANGE);
        w2.setCenterX(180.0f);

        Ellipse wing2 = new Ellipse();
        wing2.setFill(Color.DARKORANGE);
        wing2.setCenterX(180.0f);

        assertEquals(w2.getCenterX(), wing2.getCenterX());
    }

    @Test
    void rightWing1() {
        Ellipse w1 = new Ellipse();
        w1.setFill(Color.LIGHTBLUE);
        w1.setCenterX(385.0f);

        Ellipse wing1 = new Ellipse();
        wing1.setFill(Color.LIGHTBLUE);
        wing1.setCenterX(385.0f);

        assertEquals(w1.getCenterX(), wing1.getCenterX());
    }

    @Test
    void rightWing2() {
        Ellipse w2 = new Ellipse();
        w2.setFill(Color.DARKORANGE);
        w2.setCenterX(603.0f);

        Ellipse wing2 = new Ellipse();
        wing2.setFill(Color.DARKORANGE);
        wing2.setCenterX(603.0f);

        assertEquals(w2.getCenterX(), wing2.getCenterX());
    }

}