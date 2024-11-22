/*
 * Wren Nguyen
 * Project: Final
 * Assign different functions to different keys
 * 
 * Key controls:
 * 
 * '0' determines whether the shape can move or is drawn static
 * Shape Modes:'1' circle, '2' oval, '3' square, '4' rectangle, '5' triangle
 * 
 * Commands: '-'' undo, ';' clears screen, 'v' toggles counter visibility
 * 
 * Overlays: 'c' cyan overlay, 'm' magenta overlay, 'y' yellow overlay, 'k' no overlay
*/

package com.code;

public class KeyControls {
    //init
    Main main;
    LinkedList list;
    ControlManager controls;
    Audio audio;

    KeyControls(Main main_, LinkedList list_, ControlManager controls_) {
        main = main_;
        list = list_;
        controls = controls_;
        audio = new Audio(main);
    }

    //UNDO: removes the last drawn shape
    void undo() {
        //keeps from breaking program by making sure undo doesn't go out of bounds
        if (list.getIndex() > 0) { 
            list.remove(); //remove the last node
            audio.playUndo(); //play undo sound effect
        }
    }

    //key controls
    public void onKeyPressed(char key) {
        //COMMANDS (operates on -, ;, v, s)
        // - is undo
        if (key == '-') {
            undo();
        } 
        // ; is clear the screen and resets counter
        if (key == ';') {
            list.clear();
            audio.playSE("NONE");
        }
        // v toggles the counter visibility
        if (key == 'v'){
            list.toggleCounter();
        }
        // s screenshots
        if (key == 's'){
            //save screenshot
            Screenshot screenshot = new Screenshot(main);
            //save location
            screenshot.save("/Users/vinnnguyen/Documents/screenshots/Screenshot-####.png");
        }


        //OVERLAYS (operates on cmyk)
        if (key == 'c') {
            controls.applyOverlay = new CyanOverlay(main); //apply cyan overlay
            audio.playSE("CYAN"); //play cyan sound effect
        }
        if (key == 'm'){
            controls.applyOverlay = new MagentaOverlay(main); //apply magenta overlay
            audio.playSE("MAGENTA"); //play magenta sound effect
        }
        if (key == 'y') {
            controls.applyOverlay = new YellowOverlay(main);  //apply yellow overlay
            audio.playSE("YELLOW"); //play yellow sound effect
        }
        if (key == 'k') {
            controls.applyOverlay = null; //remove overlay
            audio.playSE("NONE"); //play no overlay sound effect (aka undo sound effect)
        }
        

        //SHAPE MODES (operates on 0 - 5)
        // 0 toggles whether or not the shapes can move
        if (key == '0') { 
            controls.DYNAMIC = !controls.DYNAMIC; //dynamic toggle
        }
        // 1 creates Circles
        if (key == '1') {
            controls.setShapeMode(1); //circle mode
        }
        // 2 creates Ovals
        if (key == '2') {
            controls.setShapeMode(2); //oval mode
        }
        // 3 creates Squares
        if (key == '3') {
            controls.setShapeMode(3); //square mode
        }
        // 4 creates Rectangles
        if (key == '4') {
            controls.setShapeMode(4); //rectangle mode
        }
        // 5 creates Triangles
        if (key == '5') {
            controls.setShapeMode(5); //triangle mode
        }
    }
}