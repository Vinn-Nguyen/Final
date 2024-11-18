package com.code;

public class Screenshot {
    Main main;

    Screenshot(Main main_){
        main = main_;
    }

    public void save(String fileName){
        main.saveFrame(fileName);
        System.out.println("Saved as: " + fileName);
    }
}