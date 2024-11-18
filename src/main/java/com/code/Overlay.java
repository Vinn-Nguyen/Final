/*
 * Wren Nguyen
 * Project: Final
 * Parent class for other overlays classes
*/
package com.code;

public abstract class Overlay {
    Main main;

    Overlay(Main main_){
        main = main_;
    }

    public abstract void apply();
}