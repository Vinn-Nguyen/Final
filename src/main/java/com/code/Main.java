/*
 * Wren Nguyen
 * Project: Final
 * Main class that ties everything together. Draws shapes that will fade in on mouse click.
 * Is able to save. Has a toggable counter to keep track of impressions on the screen.
 * Has different overlays. Able to delete shapes.
 * 
 * Controls:
 * Mouse Presses: draws shape (add node to list)
 * Key Presses:
 * '0' determines whether the shape can move or is drawn static
 * Shape Modes:'1' circle, '2' oval, '3' square, '4' rectangle, '5' triangle
 * Commands: '-'' undo, ';' clears screen, 'v' toggles counter visibility
 * Overlays: 'c' cyan overlay, 'm' magenta overlay, 'y' yellow overlay, 'k' no overlay
*/

package com.code;

import processing.core.*;
import processing.sound.*; 

public class Main extends PApplet {
    //init
    LinkedList linkedList;
    ControlManager controls;
    Audio audio;

    public static void main(String[] args) {
        PApplet.main("com.code.Main"); //processing
    }

    //settings
    public void settings() {
        fullScreen(); //fullscreen display
    }

    //setup
    public void setup() {
        frameRate(30); //controls the framerate so the program will run smoother

        //init
        linkedList = new LinkedList(this);  
        controls = new ControlManager(linkedList, this);
    }

    //draw
    public void draw() {
        background(0); //black background
        linkedList.drawShapes(); //draw shapes

        //applies overlay
        if (controls.applyOverlay != null) { //if there's an overlay
            controls.applyOverlay.apply(); //draw overlay
        }
        
        linkedList.display(); //display counter on top of overlay
    }

    //mouse controls
    public void mousePressed() {
        controls.onMousePressed(mouseX, mouseY);
    }

    //key controls
    public void keyPressed() {
        controls.onKeyPressed(key);
    }
}