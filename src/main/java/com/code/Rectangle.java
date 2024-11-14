/*
 * Wren Nguyen
 * Project: Final
 * Inherits from Shape and stores the info to draw a rectangle
*/

package com.code;

public class Rectangle extends Shape{

    Rectangle(float x, float y, Main main_){
        super(x, y, main_); //call superclass
    }

    @Override //override the draw method to draw a circle
    public void draw(){
        //sizes for rectangle
        float shapeWidth = sz; //width
        float shapeHeight = sz * 2; //height

        main.noStroke(); //no outline
        main.fill(color); //color
        main.rectMode(main.CENTER); //make it so that the shape is drawn in the center mouse's x/y
        main.rect(x, y, shapeWidth, shapeHeight); //draws circle
    }
}
