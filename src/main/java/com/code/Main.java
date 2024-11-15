/*
 * Wren Nguyen
 * Project: Final
 * Main class that activates everything
 */

package com.code;
import processing.core.*;

public class Main extends PApplet{
    //Call class
    LinkedList linkedList;
    Controls controls;

    public static void main(String[] args)  {
        PApplet.main("com.code.Main"); //processing
    }

    //settings
    public void settings(){
        fullScreen(); //fullscreex
    }

    //setup: init
    public void setup(){
        linkedList = new LinkedList();  //init
        controls = new Controls(linkedList, this); //init
    }

    //draw
    public void draw(){
        background(0); //black

        linkedList.drawShapes();
    }

    //mousepress
    public void mousePressed(){
        controls.onMousePressed(mouseX, mouseY);
    }

    //keypress
    public void keyPressed(){
        controls.onKeyPressed(key);
    }
}