/*
 * Wren Nguyen
 * Project: Final
 * Inherits from Shape and stores the info to draw a square
*/

package com.code;

public class Square extends Shape{

    Square(float x, float y, Main main_){
        super(x, y, main_); //call superclass
    }

    @Override //override the draw method to draw a square
    public void draw(){
        main.noStroke(); //no outline
        main.fill(color); //fill
        main.rectMode(main.CENTER); //make it so that the shape is drawn in the center
        main.rect(x, y, sz, sz); //draws circle
    }
}