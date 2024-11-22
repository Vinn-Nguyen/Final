/*
 * Wren Nguyen
 * Project: Final
 * Stores 3 different sound effects files per shape mode when shape is drawn. Plays a random sound 
 * when a shape is drawn. Also stores the undo sound effect when key is pressed. There is one sound 
 * effect for each overlay, which plays when the key is pressed.
*/

package com.code;

import processing.sound.*; //import processing sounds

public class Audio {
    //init
    Main main;

    //sound file array lists
    SoundFile [] circleSE; //circle sound effects
    SoundFile [] ovalSE; //oval sound effect
    SoundFile [] rectSE; //rectangle sound effects
    SoundFile [] squareSE; //square sound effects
    SoundFile [] triangleSE; //triangle sound effects

    //undo sound file
    SoundFile undoSE;

    //overlay sound files
    SoundFile cyanSE;
    SoundFile magentaSE;
    SoundFile yellowSE;

    Audio(Main main_){
        main = main_;

        //CIRCLE SOUND EFFECTS
        circleSE = new SoundFile[3]; //array
        //files
        circleSE[0] = new SoundFile(main, "/Users/vinnnguyen/final/data/circle1.wav");
        circleSE[1] = new SoundFile(main, "/Users/vinnnguyen/final/data/circle2.wav");
        circleSE[2] = new SoundFile(main, "/Users/vinnnguyen/final/data/circle3.wav");

        //OVAL SOUND EFFECTS
        ovalSE = new SoundFile[3]; //array
        //files
        ovalSE[0] = new SoundFile(main, "/Users/vinnnguyen/final/data/oval1.wav");
        ovalSE[1] = new SoundFile(main, "/Users/vinnnguyen/final/data/oval2.wav");
        ovalSE[2] = new SoundFile(main, "/Users/vinnnguyen/final/data/oval3.wav");
        
        //RECTANGLE SOUND EFFECT
        rectSE = new SoundFile[3]; //array
        //files
        rectSE[0] = new SoundFile(main, "/Users/vinnnguyen/final/data/rect1.wav");
        rectSE[1] = new SoundFile(main, "/Users/vinnnguyen/final/data/rect2.wav");
        rectSE[2] = new SoundFile(main, "/Users/vinnnguyen/final/data/rect3.wav");

        //SQUARE SOUND EFFECT
        squareSE = new SoundFile[3]; //array
        //files
        squareSE[0] = new SoundFile(main, "/Users/vinnnguyen/final/data/square1.wav");
        squareSE[1] = new SoundFile(main, "/Users/vinnnguyen/final/data/square2.wav");
        squareSE[2] = new SoundFile(main, "/Users/vinnnguyen/final/data/square3.wav");

        //TRIANGLE SOUND EFFECT
        triangleSE = new SoundFile[3]; //array
        //files
        triangleSE[0] = new SoundFile(main, "/Users/vinnnguyen/final/data/triangle1.wav");
        triangleSE[1] = new SoundFile(main, "/Users/vinnnguyen/final/data/triangle2.wav");
        triangleSE[2] = new SoundFile(main, "/Users/vinnnguyen/final/data/triangle3.wav");


        //OVERLAY sound effects
        //cyan
        cyanSE = new SoundFile(main, "/Users/vinnnguyen/final/data/overlay1.wav"); 
        //magenta
        magentaSE = new SoundFile(main, "/Users/vinnnguyen/final/data/overlay2.wav");
        //yellow
        yellowSE = new SoundFile(main, "/Users/vinnnguyen/final/data/overlay3.wav");


        //undo sound file (also no overlay sound effect)
        undoSE = new SoundFile(main, "/Users/vinnnguyen/final/data/undo.wav");
    }

    //play Shape sound effect
    public void playSE(String mode){
        SoundFile curSound = null; //the sound that will play

        //SHAPE MODES
        //CIRCLE MODE
        if(mode.equals("CIRCLE")){ //match shape mode
            int randomIndex = (int) main.random(0, circleSE.length); //choose random index from array
            curSound = circleSE[randomIndex]; //play random sound effect
        }

        //OVAL MODE
        if(mode.equals("OVAL")){ //match shape mode
            int randomIndex = (int) main.random(0, ovalSE.length); //choose random index from array
            curSound = ovalSE[randomIndex]; //play random sound effect
        }

        //RECTANGLE MODE
        if(mode.equals("RECT")){ //match shape mode
            int randomIndex = (int) main.random(0, rectSE.length); //choose random index from array
            curSound = rectSE[randomIndex]; //play random sound effect
        }

        //SQUARE MODE
        if(mode.equals("SQUARE")){ //match shape mode
            int randomIndex = (int) main.random(0, squareSE.length); //choose random index from array
            curSound = squareSE[randomIndex]; //play random sound effect
        }

        //TRIANGLE MODE
        if(mode.equals("TRIANGLE")){ //shape mode
            int randomIndex = (int) main.random(0, triangleSE.length); //choose random index from array
            curSound = triangleSE[randomIndex]; //play random sound effect
        }


        //OVERLAY SOUND EFFECTS
        //CYAN OVERLAY SE
        if(mode.equals("CYAN")){
            curSound = cyanSE; //cyan sound effect
        }

        //MAGENTA OVERLAY SE
        if(mode.equals("MAGENTA")){
            curSound = magentaSE; //magenta sound effect
        }

        //YELLOW OVERLAY SE
        if(mode.equals("YELLOW")){
            curSound = yellowSE; //yellow sound effect
        }

        //NO OVERLAY SE
        if(mode.equals("NONE")){
            curSound = undoSE; //also undo sound effect
        }

        
        //plays sound
        if(curSound != null){ //if there's a sound input in curSound
            if(curSound.isPlaying()){ //if there's a current sound playing
                curSound.stop(); //stop current sound to play the new sound
            }
            curSound.play(); //play sound effect
        }
    }

    //PlayUndo: plays a sound effect when you press the undo key
    public void playUndo(){
        if(undoSE != null){ //if there's a sound input in undoSE
            if(undoSE.isPlaying()){ //if there's a current sound playing
                undoSE.stop(); //stop undo sound effect to play the new sound
            }
            undoSE.play(); //play sound effect
        }
    }
}