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
    Display display;

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
        display = new Display(linkedList, this); //init
        background(0); //black
    }

    //draw
    public void draw(){
        display.draw();
    }

    //mousepress
    public void mousePressed(){
        display.onMousePress();
    }

    //keypress
    public void keyPressed(){
        display.onKeyPress();
    }
}