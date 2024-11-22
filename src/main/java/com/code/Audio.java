/*
 * Wren Nguyen
 * Project: Final
 * Stores the sound effects for each shape drawn. WORK IN PROGRESS
*/

package com.code;

import processing.sound.*;

public class Audio {
    //Sound files
    SoundFile circleSE;
    SoundFile ovalSE;
    SoundFile rectangleSE;
    SoundFile squareSE;
    SoundFile triangleSE;

    Audio(Main main){
        circleSE = new SoundFile(main, "/Users/vinnnguyen/final/data/circle.wav");
        ovalSE = new SoundFile(main, "/Users/vinnnguyen/final/data/oval.wav");
        rectangleSE = new SoundFile(main, "/Users/vinnnguyen/final/data/rectangle.wav");
        squareSE = new SoundFile(main, "/Users/vinnnguyen/final/data/square.wav");
        triangleSE = new SoundFile(main, "/Users/vinnnguyen/final/data/triangle.wav");
    }

    public void playSE(String mode){
        if(mode.equals("CIRCLE")){
            circleSE.play();
        }
        if(mode.equals("OVAL")){
            ovalSE.play();
        }
        if(mode.equals("RECT")){
            rectangleSE.play();
        }
        if(mode.equals("SQUARE")){
            squareSE.play();
        }
        if(mode.equals("TRIANGLE")){
            triangleSE.play();
        }
    }
}