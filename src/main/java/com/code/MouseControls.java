/* 
 * Wren Nguyen
 * Project: Final
 * On mouse press, draws a shape and adds the ShapeNode to the linked list
*/

package com.code;

public class MouseControls {
    Main main;
    LinkedList list;
    ControlManager controls;

    MouseControls(Main main_, LinkedList list_, ControlManager controls_) {
        main = main_;
        list = list_;
        controls = controls_;
    }

    //mouse press controls
    public void onMousePressed(int mouseX, int mouseY) {
        Shape newShape = null;

        //sets node based on shape mode
        //CIRCLE MODE
        if (controls.CIRCLE_MODE) {
            newShape = new Circle(mouseX, mouseY, main);
        } 
        //OVAL MODE
        if (controls.OVAL_MODE) {
            newShape = new Oval(mouseX, mouseY, main);
        }
        //SQUARE MODE
        if (controls.SQUARE_MODE) {
            newShape = new Square(mouseX, mouseY, main);
        }
        //RECTANGLE MODE
        if (controls.RECT_MODE) {
            newShape = new Rectangle(mouseX, mouseY, main);
        }
        //TRIANGLE MODE
        if (controls.TRI_MODE) {
            newShape = new Triangle(mouseX, mouseY, main);
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
