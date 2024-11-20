/*
 * Wren Nguyen
 * Project: Final
 * Inherits from Shape to draw a circle
*/

package com.code;

public class Circle extends Shape {
    public Circle(float x, float y, Main main) {
        super(x, y, main); //call superclass
    }

    @Override //draws circle
    public void draw() {
        fadeInAndDraw(); //fades in and draws shape
        move();  //moves if needed
        main.noStroke(); //no outline
        main.ellipse(x, y, sz, sz);
    }
}