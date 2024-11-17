/*
 * Wren Nguyen
 * Project: Final
 * Inherits from Shape to draw a rectangle
*/

package com.code;

public class Rectangle extends Shape{
    //sizes for rectangle
    float shapeWidth = main.random(10, 150); //width
    float shapeHeight = main.random(10, 150); //height 

    Rectangle(float x, float y, Main main_){
        super(x, y, main_); //call superclass
        this.shapeHeight = main.random(10, 150); //randomize height
        this.shapeWidth = main.random(10, 150); //randomize width
    }

    @Override //override the draw method to draw a circle
    public void draw(){
        main.noStroke(); //no outline
        main.fill(color); //color
        main.rectMode(main.CENTER); //make it so that the shape is drawn in the center mouse's x/y
        main.rect(x, y, shapeWidth, shapeHeight); //draws circle
    }
}