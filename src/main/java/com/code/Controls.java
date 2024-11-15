/*
 * Wren Nguyen
 * Project: Final
 * Settings for the shape and draws the shape
 */
package com.code;

import com.jogamp.opengl.util.packrect.Rect;

public class Controls implements OnMousePress, OnKeyPress{
    Main main; //init processing
    LinkedList list; //init list
    Shape newShape;

    //BOOLEANS
    boolean CIRCLE_MODE = true; //default is draw circle
    boolean SQUARE_MODE; //draw square
    boolean RECT_MODE; //draw rect


    Controls(LinkedList list_, Main main_){
        list = list_;
        main = main_;
    }

    //Controls what happens when mouse is pressed
    @Override
    public void onMousePressed(int x, int y){
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
        list.insert(newShape);
    }

    //Controls what happen when the key is pressed
    @Override
    public void onKeyPressed(char key){
        //undo button
        if(main.key == 'p'){
            undo();
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

    //undo
    void undo(){
        if(list.getIndex() > 0){ //while the list is greater than 0
            list.remove(); //remove the latest node
        }
    }
}
