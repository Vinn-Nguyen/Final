/*
 * Wren Nguyen
 * Project: Final
 * Inherits from Shape to draw a rectangle.
*/

package com.code;

import processing.core.PConstants;

public class Rectangle extends Shape{
    //sizes for rectangle
    float shapeWidth; //width
    float shapeHeight; //height 

    Rectangle(float x, float y, Main main_){
        super(x, y, main_); //call superclass
        this.shapeHeight = main.random(10, 150); //randomize height
        this.shapeWidth = main.random(10, 150); //randomize width
    }

    @Override //override the draw method to draw a rectangle
    public void draw(){
        fadeInAndDraw(); //fades in and draws shape
        move(); //moves if able
        main.noStroke(); //no outline
        main.rectMode(PConstants.CENTER); //make it so that the shape is drawn in the center mouse's x/y
        main.rect(x, y, shapeWidth, shapeHeight); //draws rectangle
    }
}