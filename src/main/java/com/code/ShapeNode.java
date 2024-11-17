/*
 * Wren Nguyen
 * Project: Final
 * Description: ShapeNode class that contain the all the getter/setters info for linked lists
 */

package com.code;

public class ShapeNode {
    Shape shape; //call shape
    ShapeNode next; //next node
    
    ShapeNode(Shape shape){
        this.shape = shape;
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
}