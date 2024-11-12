/*
 * Wren Nguyen
 * Project: Final
 * Main class that activates everything
 */

package com.code;
import processing.core.*;

public class Main extends PApplet{
    LinkedList linkedList; //call
    public static void main(String[] args)  {
        PApplet.main("com.code.Main");
    }

    //size
    public void settings(){
        size(1000, 600); //canvas size
    }

    public void setup(){
        linkedList = new LinkedList();  //init
        background(0); //black
    }

    //THIS IS SUBJECTED TO CHANGE. I just want to get it to work
    public void draw(){
        for(int i = 0; i < linkedList.getIndex();i++){
            ShapeNode currentNode = linkedList.getNode(i);
            float sz = 50; //size of the shape PLACEHOLDER

            //draw circle PLACEHOLDER
            fill (255); //fill
            ellipse(currentNode.x, currentNode.y, sz, sz); //parameters
        }
    }

    //add a node every time the mouse is pressed, and add it in the mouse's x/y location
    public void mousePressed(){
        linkedList.insert(mouseX, mouseY);
        linkedList.print();
    }
}