/*
 * Wren Nguyen
 * Project: Final
 * Main class that activates everything
 */

package com.code;
import processing.core.*;

public class Main extends PApplet{
    LinkedList linkedList; //call
    Display display;
    public static void main(String[] args)  {
        PApplet.main("com.code.Main");
    }

    //size
    public void settings(){
        size(1000, 600); //canvas size
    }

    public void setup(){
        linkedList = new LinkedList();  //init
        display = new Display(linkedList, this); //init
        background(0); //black
    }

    //THIS IS SUBJECTED TO CHANGE. I just want to get it to work
    public void draw(){
        display.draw();
    }

    //add a node every time the mouse is pressed, and add it in the mouse's x/y location
    public void mousePressed(){
        display.OnMousePress();
    }
}