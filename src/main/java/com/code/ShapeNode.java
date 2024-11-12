/*
 * Wren Nguyen
 * Project: Final
 * Description: ShapeNode class that contains all the getter/setters/shape info
 */

package com.code;

public class ShapeNode {
    public ShapeNode next;
    float x, y; //x & y for the shapes

    //SHAPE TYPES
    boolean squareOn;
    boolean circleOn;
    boolean rectangleOn;
    
    public ShapeNode(float x, float y){
        this.x = x;
        this.y = y;
        this.next = null;
    }

    //get next node
    public ShapeNode getNext(){
        return next;
    }

    //set next node (insert)
    public void setNext(ShapeNode nextPtr){
        this.next = nextPtr;
    }
    
    //WIP
    boolean circle(){
        return circleOn = true;
    }
}
