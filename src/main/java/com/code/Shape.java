/*
 * Wren Nguyen
 * Project: Final
 * Parent class where all the shape info is stored
*/

package com.code;

public abstract class Shape {
    //init
    Main main;
    Overlay overlay;

    //varibles
    float x, y; //x/y for shape
    int color; //color
    float sz; //size

    //movement
    boolean canMove;
    float speedX, speedY;

    //fade in
    float fade; 
    double fadeSpeed = 0.15; //speed of fade in
    int alpha; //transparency

    Shape(float x, float y, Main main_) {
        main = main_;
        this.x = x;
        this.y = y;
        this.sz = main.random(10, 150); //size range
        
        //randomize red, blue, green varibles for shape
        this.color = main.color(main.random(255), main.random(255), main.random(255), 
        0); //init alpha at 0
        this.alpha = (int)main.random(255); //randomized the transparency variable

        //movement varibles
        this.canMove = false;
        //random speeds
        this.speedX = main.random(-1, 1);
        this.speedY = main.random(-1, 1);

        //fade in varibles
        this.fade = 0; //init at 0
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
                speedX *= -1; //reverse
            }
            //bounce on the top and bottom edges of the screen
            if (y <= 0 || y >= main.height) {
                speedY *= -1; //revers
            }
        }
    }

    //toggle if a shape can/cannot move
    public void canMove() {
        this.canMove = !this.canMove;
    }

    //set overlay
    public void setOverlay(Overlay overlay_) {
        overlay = overlay_;
    }

    //draws the shape and fades in when drawn
    public void fadeInAndDraw(){
        //fade in
        if (fade < 1) {
            fade += fadeSpeed; //rate of which it fades in
        }
        
        //updating the transparency
        int curAlpha = (int)(fade * alpha); 

        //fill of the shape
        main.fill(main.red(color), main.green(color), main.blue(color), curAlpha);
    }
}