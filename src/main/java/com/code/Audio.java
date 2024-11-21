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
        circleSE = new SoundFile(main, "/Users/vinnnguyen/final/data/circle.mp3");
        ovalSE = new SoundFile(main, "/Users/vinnnguyen/final/data/oval.mp3");
        rectangleSE = new SoundFile(main, "/Users/vinnnguyen/final/data/rectangle.mp3");
        squareSE = new SoundFile(main, "/Users/vinnnguyen/final/data/square.mp3");
        triangleSE = new SoundFile(main, "/Users/vinnnguyen/final/data/triangle.mp3");
    }
}
