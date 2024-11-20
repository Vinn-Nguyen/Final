/*
 * Wren Nguyen
 * Project: Final
 * ControlManager manages KeyControls and MouseControls. Sets different modes
*/

package com.code;

public class ControlManager implements OnMousePress, OnKeyPress {
    //init
    Main main;
    LinkedList list;
    KeyControls key;
    MouseControls mouse;

    //shape modes
    boolean CIRCLE_MODE = true; //default is draw circle
    boolean OVAL_MODE; //draw oval
    boolean SQUARE_MODE; //draw square
    boolean RECT_MODE; //draw rect
    boolean TRI_MODE; //draw triangle

    Overlay applyOverlay = null; //default overlay is none
    boolean DYNAMIC = false; //default is static

    ControlManager(LinkedList list_, Main main_) {
        main = main_;
        list = list_;
        key = new KeyControls(main, list, this);
        mouse = new MouseControls(main, list, this);
    }

    //set shape mode based on key input
    public void setShapeMode(int mode) {
        //CIRCLE MODE
        if (mode == 1){
            CIRCLE_MODE = true; // turn on
            OVAL_MODE = false; // turn off
            SQUARE_MODE = false; // turn off
            RECT_MODE = false; // turn off
            TRI_MODE = false; // turn off
        }
        //OVAL MODE
        if (mode == 2){
            CIRCLE_MODE = false; // turn off
            OVAL_MODE = true; // turn on
            SQUARE_MODE = false; // turn off
            RECT_MODE = false; // turn off
            TRI_MODE = false; // turn off
        }
        //SQUARE MODE
        if (mode == 3){
            CIRCLE_MODE = false; // turn off
            OVAL_MODE = false; // turn off
            SQUARE_MODE = true; // turn on
            RECT_MODE = false; // turn off
            TRI_MODE = false; // turn off
        }
        //RECTANGLE MODE
        if (mode == 4){
            CIRCLE_MODE = false; // turn off
            OVAL_MODE = false; // turn off
            SQUARE_MODE = false; // turn off
            RECT_MODE = true; // turn on
            TRI_MODE = false; // turn off
        }
        //TRIANGLE MODE
        if (mode == 5){
            CIRCLE_MODE = false; // turn off
            OVAL_MODE = false; // turn off
            SQUARE_MODE = false; // turn off
            RECT_MODE = false; // turn off
            TRI_MODE = true; // turn on
        }
    }

    @Override //override mouse press to reference MouseControls
    public void onMousePressed(int mouseX, int mouseY) {
        mouse.onMousePressed(mouseX, mouseY);
    }

    @Override //override key press to reference KeyControls
    public void onKeyPressed(char key_) {
        key.onKeyPressed(key_);
    }
}