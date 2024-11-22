/* 
 * Wren Nguyen
 * Project: Final
 * On mouse press, draws a shape and adds the ShapeNode to the linked list.
*/

package com.code;

public class MouseControls {
    //init
    Main main;
    LinkedList list;
    ControlManager controls;
    Audio audio;

    MouseControls(Main main_, LinkedList list_, ControlManager controls_) {
        main = main_;
        list = list_;
        controls = controls_;
        audio = new Audio(main);
    }

    //mouse press controls
    public void onMousePressed(int mouseX, int mouseY) {
        Shape newShape = null;

        //sets node based on shape mode
        //CIRCLE MODE
        if (controls.CIRCLE_MODE) {
            newShape = new Circle(mouseX, mouseY, main);
            audio.playSE("CIRCLE");
        } 
        //OVAL MODE
        if (controls.OVAL_MODE) {
            newShape = new Oval(mouseX, mouseY, main);
            audio.playSE("OVAL");
        }
        //SQUARE MODE
        if (controls.SQUARE_MODE) {
            newShape = new Square(mouseX, mouseY, main);
            audio.playSE("SQUARE");
        }
        //RECTANGLE MODE
        if (controls.RECT_MODE) {
            newShape = new Rectangle(mouseX, mouseY, main);
            audio.playSE("RECT");
        }
        //TRIANGLE MODE
        if (controls.TRI_MODE) {
            newShape = new Triangle(mouseX, mouseY, main);
            audio.playSE("TRIANGLE");
        }

        //determines if shape is static or dynamic
        if (controls.DYNAMIC) {
            newShape.canMove();
        }

        //inserts shapes into the linked list
        if (newShape != null) {
            list.insert(newShape);
        }
    }
}