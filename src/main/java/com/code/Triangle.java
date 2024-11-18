/*
 * Wren Nguyen
 * Project: Final
 * Inherits from Shape and stores the info to draw a triangle
*/

package com.code;

public class Triangle extends Shape{
    //triangle varibles
    float x1 = x - sz;
    float x2 = x + sz;
    float x3 = x;
    float y1 = y + sz;
    float y2 = y + sz;
    float y3 = y - sz;

    Triangle(float x, float y, Main main_){
        super(x, y, main_); //call superclass
    }

    @Override //override the draw method to draw a triangle
    public void draw(){
        move(); //moves if able
        main.noStroke(); //no outline
        main.fill(color); //fill
        main.triangle(x1, y1, x2, y2, x3, y3); //draw triangle
    }
}