/*
 * Wren Nguyen
 * Project: Final
 * Controls what happens when certain keys are pressed and when the mouse is pressed.
 * 
 * Mouse Presses: draws shape (add node to list)
 * 
 * Key Presses:
 * Shape Modes: '1' circle, '2' oval, '3' square, '4' rectangle, '5' triangle
 * Commands: '-'' undo, ';' clears screen, 'v' toggles counter visibility
 * Overlays: 'c' cyan overlay, 'm' magenta overlay, 'y' yellow overlay, 'k' no overlay
*/

package com.code;

public class Controls implements OnMousePress, OnKeyPress {
    //init
    Main main;
    LinkedList list;
    Counter counter;
    Shape newShape;

    Overlay applyOverlay = null; //default overlay is none

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
 
    @Override //override to control the mouse pressed
    public void onMousePressed(int x, int y) {
        //draw circle
        if (CIRCLE_MODE) {
            newShape = new Circle(main.mouseX, main.mouseY, main);
        } 
        //draw square
        if (SQUARE_MODE) {
            newShape = new Square(main.mouseX, main.mouseY, main);
        }
        //draw rectangle
        if (RECT_MODE) {
            newShape = new Rectangle(main.mouseX, main.mouseY, main);
        }
        //draw oval
        if (OVAL_MODE) {
            newShape = new Oval(main.mouseX, main.mouseY, main);
        }
        //draw trinagle
        if (TRI_MODE) {
            newShape = new Triangle(main.mouseX, main.mouseY, main);
        }

        //insert node at the end of the list
        list.insert(newShape); 
    }

    @Override //override the keys to controls the key is pressed
    public void onKeyPressed(char key) {
        // - is undo
        if (main.key == '-') {
            undo();
        } 
        // ; is clear the screen and resets counter
        else if (main.key == ';') {
            list.clear();
        }
        // v toggles the counter visibility
        else if(main.key == 'v'){
            list.toggleCounter();
        }


        //OVERLAYS
        // c toggles cyan overlay
        if (main.key == 'c') {
            applyOverlay = new CyanOverlay(main); 
        }
        // m toggles magenta overlay
        if (main.key == 'm'){
            applyOverlay = new MagentaOverlay(main);
        }
        // y toggles yellow overlay
        if (main.key == 'y') {
            applyOverlay = new YellowOverlay(main); 
        }
        // k is no overlay
        if (main.key == 'k') {
            applyOverlay = null;
        }


        //SHAPE MODES
        // 1 creates Circles
        if (main.key == '1') {
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
        if (main.key == '3') {
            CIRCLE_MODE = false; // turn off
            OVAL_MODE = false; // turn off
            SQUARE_MODE = true; // turn on
            RECT_MODE = false; // turn off
            TRI_MODE = false; // turn off
        } 
        // 4 creates Rectangles
        if (main.key == '4') {
            CIRCLE_MODE = false; // turn off
            OVAL_MODE = false; // turn off
            SQUARE_MODE = false; // turn off
            RECT_MODE = true; // turn on
            TRI_MODE = false; // turn off
        }
        // 5 creates Triangles
        if (main.key == '5') {
            CIRCLE_MODE = false; // turn off
            OVAL_MODE = false; // turn off
            SQUARE_MODE = false; // turn off
            RECT_MODE = false; // turn off
            TRI_MODE = true; // turn on
        }
    }

    //Removes the last drawn shape
    void undo(){
        if (list.getIndex() > 0) {
            list.remove(); //remove node
        }
    }
}