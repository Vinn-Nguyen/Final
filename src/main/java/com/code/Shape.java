/*
 * Wren Nguyen
 * Project: Final
 * Parent class where all the shape info is stored
*/

package com.code;

public abstract class Shape {
    //call classes
    Main main;
    Overlay overlay;

    //varibles
    float x, y; //x/y for shape
    int color; //color
    float sz; //size

    //movement
    boolean canMove;
    float speedX, speedY;

    Shape(float x, float y, Main main_) {
        main = main_;
        this.x = x;
        this.y = y;
        this.sz = main.random(10, 150); //size range
        
        //randomize red, blue, green, transparency varibles
        this.color = main.color(main.random(255), main.random(255), 
        main.random(255), main.random(255));

        //movement varibles
        this.canMove = false;
        //random speeds
        this.speedX = main.random(-1, 1);
        this.speedY = main.random(-1, 1);
    }

    public abstract void draw();

    //move
    public void move() {
        if (canMove) { //if the shape is able to move
            //x/y directions
            x += speedX;
            y += speedY;

            //bounce on the left and right edges of the screen
            if (x <= 0 || x >= main.width) {
                speedX *= -1;
            }
            //bounce on the top and bottom of the screen
            if (y <= 0 || y >= main.height) {
                speedY *= -1;
            }
        }
    }

    //toggle move
    public void canMove() {
        this.canMove = !this.canMove;
    }

    //set overlay
    public void setOverlay(Overlay overlay_) {
        overlay = overlay_;
    }
}