package com.code;

public class Triangle extends Shape{
    Triangle(float x, float y, Main main_){
        super(x, y, main_); //call superclass
    }

    @Override //override the draw method to draw a triangle
    public void draw(){
        main.noStroke(); //no outline
        main.fill(color); //fill
        main.triangle(x - sz, y + sz, x + sz, y + sz, x, y - sz);
    }
}