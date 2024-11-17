/*
 * Wren Nguyen
 * Project: Final
 * Main class that activates everything
 */

package com.code;
import processing.core.*;

public class Main extends PApplet {
    //call classes
    LinkedList linkedList;
    Controls controls;

    public static void main(String[] args) {
        PApplet.main("com.code.Main");
    }

    public void settings() {
        fullScreen(); //fullscreen
    }

    public void setup() {
        //init
        linkedList = new LinkedList(this);  
        controls = new Controls(linkedList, this);
    }

    public void draw() {
        background(0); //black
        linkedList.drawShapes(); //draw the shapes
        linkedList.display(); //display the counter
    }

    public void mousePressed() {
        controls.onMousePressed(mouseX, mouseY); //implement mouse controls
    }

    public void keyPressed() {
        controls.onKeyPressed(key); //implements key controls
    }
}
