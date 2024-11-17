/*
 * Wren Nguyen
 * Project: Final
 * Parent class where all the shape info is stored
 */

package com.code;

public abstract class Shape {
    Main main; //call main
    float x, y; //x and y position
    int color; //colors
    float sz; //size

    Shape(float x, float y, Main main_){ //set parameters for parent class
        main = main_;
        this.x = x;
        this.y = y;

        //randomize red, blue, green, transparency varibles
        this.color = main.color(main.random(255), main.random(255), main.random(255), main.random(255));
        //random size
        this.sz = main.random(10, 150); 
    }

    public abstract void draw();

    

}