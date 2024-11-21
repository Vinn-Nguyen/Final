/*
 * Wren Nguyen
 * Project: Final
 * Class that takes a screenshot of the frame on screen
*/

package com.code;

public class Screenshot {
    //init
    Main main;

    Screenshot(Main main_){
        main = main_;
    }

    //save method
    public void save(String fileName){
        main.saveFrame(fileName); //screenshots
        System.out.println("Saved as: " + fileName); //prints save w/filename
    }
}