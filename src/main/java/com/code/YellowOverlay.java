/*
 * Wren Nguyen
 * Project: Final
 * Draws a semi-transparent yellow overlay over the shapes. Blends the shape colors.
*/

package com.code;
import processing.core.PConstants;

public class YellowOverlay extends Overlay {
    int alpha = 25; //transparency
    int overlayColor = main.color(255, 225, 0, alpha); //yellow

    public YellowOverlay(Main main){
        super(main); //superclass
    }

    @Override //applies yellow overlay
    public void apply() {
        main.noStroke(); //no outline
        main.fill(overlayColor); //fills
        main.rectMode(PConstants.CENTER); //draw from center
        main.rect(main.width/2, main.height/2, main.width, main.height); //fullscreen overlay
    }
}