/*
 * Wren Nguyen
 * Project: Final
 * Controls what happens when certain keys are pressed and when the mouse is pressed.
 * 
 * Mouse Press: draws shape (add node to list)
 * 
 * Key Press:
 * Shape Modes: 1 circle, 2 oval, 3 square, 4 rectangle, 5 triangle
 * - undo, c clears screen, v toggles counter visibility
*/

package com.code;

public class Controls implements OnMousePress, OnKeyPress {
    //init
    Main main;
    LinkedList list;
    Counter counter;
    Shape newShape;

    //shape modes
    boolean CIRCLE_MODE = true; // default is draw circle
    boolean OVAL_MODE; // draw oval
    boolean SQUARE_MODE; // draw square
    boolean RECT_MODE; // draw rect
    boolean TRI_MODE; // draw triangle

    Controls(LinkedList list_, Main main_) {
        list = list_;
        main = main_;
    }
 
    @Override //override the mouse interface to control what happens when the mouse is pressed
    public void onMousePressed(int x, int y) {
        //draw circle
        if (CIRCLE_MODE) {
            newShape = new Circle(main.mouseX, main.mouseY, main);
        } 
        //draw square
        else if (SQUARE_MODE) {
            newShape = new Square(main.mouseX, main.mouseY, main);
        }
        //draw rectangle
        else if (RECT_MODE) {
            newShape = new Rectangle(main.mouseX, main.mouseY, main);
        }
        //draw oval
        else if (OVAL_MODE) {
            newShape = new Oval(main.mouseX, main.mouseY, main);
        }
        //draw trinagle
        else if (TRI_MODE) {
            newShape = new Triangle(main.mouseX, main.mouseY, main);
        }

        //insert node at the end of the list
        list.insert(newShape); 
    }

    
    @Override //override the key interface to controls what happens when the key is pressed
    public void onKeyPressed(char key) {
        // - is undo
        if (main.key == '-') {
            undo();
        } 
        // c is clear the screen and resets counter
        else if (main.key == 'c') {
            list.clear();
        }
        //v toggles the counter visibility
        else if(main.key == 'v'){
            list.toggleCounter();
        }

        //SHAPE MODES
        // 1 creates Circles
        else if (main.key == '1') {
            CIRCLE_MODE = true; // turn on
            OVAL_MODE = false; // turn off
            SQUARE_MODE = false; // turn off
            RECT_MODE = false; // turn off
            TRI_MODE = false; // turn off
        }
        // 2 creates Oval
        if (main.key == '2') {
            CIRCLE_MODE = false; // turn off
            OVAL_MODE = true; // turn on
            SQUARE_MODE = false; // turn off
            RECT_MODE = false; // turn off
            TRI_MODE = false; // turn off
        }
        // 3 creates Squares
        else if (main.key == '3') {
            CIRCLE_MODE = false; // turn off
            OVAL_MODE = false; // turn off
            SQUARE_MODE = true; // turn on
            RECT_MODE = false; // turn off
            TRI_MODE = false; // turn off
        } 
        // 4 creates Rectangles
        else if (main.key == '4') {
            CIRCLE_MODE = false; // turn off
            OVAL_MODE = false; // turn off
            SQUARE_MODE = false; // turn off
            RECT_MODE = true; // turn on
            TRI_MODE = false; // turn off
        }
        // 5 creates Triangles
        else if (main.key == '5') {
            CIRCLE_MODE = false; // turn off
            OVAL_MODE = false; // turn off
            SQUARE_MODE = false; // turn off
            RECT_MODE = false; // turn off
            TRI_MODE = true; // turn on
        }
    }

    //Removes the last drawn shape
    void undo() {
        if (list.getIndex() > 0) {
            list.remove(); //remove node
        }
    }
}