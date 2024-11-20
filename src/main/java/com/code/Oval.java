/*
 * Wren Nguyen
 * Project: Final
 * Inherits from Shape to draw an oval
*/

package com.code;

public class Oval extends Shape{
    //oval variables
    float ovalWidth; //width
    float ovalHeight; //height

    Oval(float x, float y, Main main_){
        super(x, y, main_); //call superclass
        this.ovalWidth = main.random(10, 150); //random width
        this.ovalHeight = main.random(10,150); //random height
    }

    @Override //override the draw method to draw a oval
    public void draw(){
        fadeInAndDraw(); //fades in and draws shape
        move(); //moves when able
        main.noStroke(); //no outline
        main.ellipse(x, y, ovalWidth, ovalHeight); //draws oval
    }
}