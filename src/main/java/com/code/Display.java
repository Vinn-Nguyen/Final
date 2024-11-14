/*
 * Wren Nguyen
 * Project: Final
 * Settings for the shape and draws the shape
 */
package com.code;

public class Display{
    Main main; //init processing
    LinkedList list; //init list

    Shape newShape; //creating a new shape

    //BOOLEANS
    boolean CIRCLE_MODE = true; //default is draw circle
    boolean SQUARE_MODE; //draw square
    boolean RECT_MODE; //draw rect

    boolean isUndo;


    Display(LinkedList list_, Main main_){
        list = list_;
        main = main_;
    }

    //Controls what happens when mouse is pressed
    public void onMousePress(){
        //CONDITIONS
        //create circle
        if(CIRCLE_MODE){
            newShape = new Circle(main.mouseX, main.mouseY, main);
        }
        //create square
        else if(SQUARE_MODE){
            newShape = new Square(main.mouseX, main.mouseY, main);
        }
        //create rectangle
        else if(RECT_MODE){
            newShape = new Rectangle(main.mouseX, main.mouseY, main);
        }

        //insert node to at the end of the list
        list.insert(newShape);
        list.print();
    }

    //Controls what happen when the key is pressed
    public void onKeyPress(){
        //undo button
        if(main.key == 'p'){
            isUndo = true;
        }

        //Q creates Circles
        if(main.key == 'q'){
            CIRCLE_MODE = true; //turn on
            SQUARE_MODE = false; //turn off
            RECT_MODE = false; //turn off
        }
        //W creates Squares
        else if(main.key == 'w'){
            CIRCLE_MODE = false; //turn off
            SQUARE_MODE = true; //turn on
            RECT_MODE = false; //turn off
        } 
        //E creates Rectangles
        else if (main.key == 'e'){
            CIRCLE_MODE = false; //turn off
            SQUARE_MODE = false; //turn off
            RECT_MODE = true; //turn on
        }
    }

    //draw the shapes from the list
    public void draw(){
        list.drawShapes();
    }
}
