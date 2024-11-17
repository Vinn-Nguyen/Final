/*
 * Wren Nguyen
 * Project: Final
 * Counter keep tracks of how many shapes are present on screen. Is toggleable.
*/

package com.code;

public class Counter {
    Main main;
    int index = 0; //set counter to 0
    boolean show = false;
    
    Counter(Main main_) {
        main = main_;
    }

    //add to the counter
    public void add() {
        index++;
    }

    //subtract from the counter
    public void subtract() {
        if (index > 0) { //ensures the counter doesnt break
            index--;
        }
    }

    //check what the current index is
    public int getIndex() {
        return index;
    }

    //reset the counter to 0
    public void reset() {
        index = 0;
    }

    //makes show toggleable
    public void toggle(){
        show = !show;
    }

    //switches the boolean
    public boolean show() {
        return show;
    }

    // Draw the counter
    public void draw() {
        int textSz = 40; //text size
        int counterX = 20; //position of counter's x
        int counterY = main.height - 30; //position of counter's y

        //draw if show is true
        if(show) {
            main.fill(255); //white
            main.textSize(textSz);
            main.text("Shapes: " + index, counterX, counterY);
        }
    }
}