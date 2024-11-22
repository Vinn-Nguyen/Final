/*
 * Wren Nguyen
 * Project: Final
 * Draws a semi-transparent magenta overlay over the shapes. Blends the shape colors.
*/

package com.code;

import processing.core.PConstants;

public class MagentaOverlay extends Overlay {
    //variables
    int alpha = 25; //transparency
    int overlayColor = main.color(255, 0, 255, alpha); //magenta

    public MagentaOverlay(Main main){
        super(main); //call superclass
    }

    @Override //applies magenta
    public void apply() {
        main.noStroke(); //no outline
        main.fill(overlayColor); //fill
        main.rectMode(PConstants.CENTER); //draw from center
        main.rect(main.width/2, main.height/2, main.width, main.height); //fullscreen overlay
    }
}