/*
 * Wren Nguyen
 * Project: Final
 * Draws a semi-transparent magenta overlay over the shapes. Blends the shape colors.
*/

package com.code;

public class MagentaOverlay extends Overlay {
    int overlayColor = main.color(255, 0, 255, alpha); //magenta

    public MagentaOverlay(Main main){
        super(main);
    }

    @Override //applies magenta
    public void apply() {
        main.noStroke(); //no outline
        main.fill(overlayColor); //fill
        main.rectMode(main.CENTER); //draw from center
        main.rect(main.width/2, main.height/2, main.width, main.height); //fullscreen overlay
    }
}

