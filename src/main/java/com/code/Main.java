/*
 * Wren Nguyen
 * Project: Final
 * Main class that ties everything together
*/

package com.code;
import processing.core.*;

public class Main extends PApplet {
    //Call classes
    LinkedList linkedList;
    Controls controls;

    public static void main(String[] args) {
        PApplet.main("com.code.Main"); //processing
    }

    public void settings() {
        fullScreen(); //fullscreen display
    }

    public void setup() {
        //init
        linkedList = new LinkedList(this);  
        controls = new Controls(linkedList, this);
    }

    public void draw() {
        background(0); //black backgriund
        linkedList.drawShapes();  //draw shapes

        //applies overlay
        if (controls.applyOverlay != null) { //if there's an overlay
            controls.applyOverlay.apply(); //draw overlay
        }

        linkedList.display();  //display counter
    }

    public void mousePressed() {
        controls.onMousePressed(mouseX, mouseY); //mouse controls
    }

    public void keyPressed() {
        controls.onKeyPressed(key); //key controls
    }
}