package com.code;

public class Display{
    Main main;
    LinkedList linkedList;

    Display(LinkedList list, Main main_){
        linkedList = list;
        main = main_;
    }

    public void OnMousePress(){
        linkedList.insert(main.mouseX, main.mouseY);
        linkedList.print();
        //System.out.println(main.mouseX);
    }

    public void draw(){
        for(int i = 0; i < linkedList.getIndex();i++){
            ShapeNode currentNode = linkedList.getNode(i);
            float sz = 50; //size of the shape PLACEHOLDER

            //draw circle PLACEHOLDER
            main.fill (255); //fill
            main.ellipse(currentNode.x, currentNode.y, sz, sz); //parameters
        }
    }
}
