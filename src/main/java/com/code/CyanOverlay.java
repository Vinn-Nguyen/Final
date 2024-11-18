/*
 * Wren Nguyen
 * Project: Final
 * Draws a semi-transparent cyan overlay over the shapes. Blends the shape colors.
*/

package com.code;

import processing.core.PConstants;

public class CyanOverlay extends Overlay {
    int alpha = 25; //transparency
    int overlayColor = main.color(0, 225, 255, alpha); //cyan
     
    public CyanOverlay(Main main){
        super(main); //superclass
    }

    @Override //applies cyan
    public void apply(){
        main.noStroke(); //no outline
        main.fill(overlayColor); //overlay
        main.rectMode(PConstants.CENTER); //draw from the center
        main.rect(main.width/2, main.height/2, main.width, main.height); //fullscreen filter
    }
}
