/*
 * Wren Nguyen
 * Project: Final
 * Inherits from Shape and stores the info to draw a triangle
*/

package com.code;

public class Triangle extends Shape{
    Triangle(float x, float y, Main main_){
        super(x, y, main_); //call superclass
    }

    @Override //override the draw method to draw a triangle
    public void draw(){
        float newSz = sz/2; //makes the triangle more accurately sized

        //triangle varibles
        float x1 = x - newSz;
        float x2 = x + newSz;
        float x3 = x;
        float y1 = y + newSz;
        float y2 = y + newSz;
        float y3 = y - newSz;

        fadeInAndDraw(); //fades in and draws shape
        move(); //moves if able
        main.noStroke(); //no outline
        main.triangle(x1, y1, x2, y2, x3, y3); //draw triangle
    }
}