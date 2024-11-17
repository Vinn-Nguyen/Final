/*
 * Wren Nguyen
 * Project: Final
 * Inherits from Shape to draw an oval
*/

package com.code;

public class Oval extends Shape{
    //VARIABLES
    float ovalWidth; //width
    float ovalHeight; //height

    Oval(float x, float y, Main main_){
        super(x, y, main_); //call superclass
        this.ovalWidth = main.random(10, 150);
        this.ovalHeight = main.random(10,150);
    }

    @Override //override the draw method to draw a triangle
    public void draw(){
        main.noStroke(); //no outline
        main.fill(color); //fill
        main.ellipse(x, y, ovalWidth, ovalHeight);
    }
}