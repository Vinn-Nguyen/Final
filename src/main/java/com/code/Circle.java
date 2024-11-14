/*
 * Wren Nguyen
 * Project: Final
 * Inherits from Shape to draw a circle
 */

package com.code;

public class Circle extends Shape {

    Circle(float x, float y, Main main_){
        super(x, y, main_); //call the superclass
    }

    @Override //override the abstract method to draw a circle
    public void draw(){
        main.noStroke(); //no outline
        main.fill(color); //fill
        main.ellipseMode(main.CENTER); //draw the circle in the center of the x/y
        main.ellipse(x, y, sz, sz); //draws circle
    }
}
