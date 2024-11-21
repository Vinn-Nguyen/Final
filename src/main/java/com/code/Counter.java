/*
 * Wren Nguyen
 * Project: Final
 * Counter keep tracks of how many impressions are present on screen. 
 * Is toggleable as to not interfere with the piece.
*/

package com.code;

public class Counter {
    Main main;
    
    int index = 0; //set counter to 0
    boolean show = false; //show/hide counter
    
    Counter(Main main_) {
        main = main_;
    }

    //ADD: add to the counter
    public void add() {
        index++;
    }

    //SUBTRACT: subtract from the counter
    public void subtract() {
        if (index > 0) { //ensures the counter doesnt break
            index--;
        }
    }

    //GETINDEX: get index
    public int getIndex() {
        return index;
    }

    //RESET: reset the counter to 0
    public void reset() {
        index = 0;
    }

    //TOGGLE: makes counter toggleable
    public void toggle(){
        show = !show;
    }

    //SHOW: switches the boolean
    public boolean show() {
        return show;
    }

    //draw counter
    public void draw() {
        int textSz = 40; //text size
        int counterX = 20; //position of counter's x
        int counterY = main.height - 30; //position of counter's y

        //draw if show is true
        if(show) {
            main.fill(255); //white
            main.textSize(textSz);
            main.text("Impressions - " + index, counterX, counterY); //text display
        }
    }
}