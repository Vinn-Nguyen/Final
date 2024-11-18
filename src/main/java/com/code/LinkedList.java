/*
 * Wren Nguyen
 * Project: Final
 * Manages the nodes (and their functions) and stores the shape info
*/

package com.code;

public class LinkedList {
    Main main;
    Counter counter;

    ShapeNode head; //head of the list
    boolean isUndo = false; //when to undo

    LinkedList(Main main_){
        main = main_;
        head = null;
        counter = new Counter(main);
    }

    //ISEMPTY: checks if the list is empty
    boolean isEmpty() {
        return head == null;
    }

    //PRINT: print the index (for testing)
    public void print(){
        //if the list empty, return list is empty.
        if(isEmpty()){
            System.out.println("List is empty.");
        }

        ShapeNode current = head; //start at the head
        while (current != null){ //traverse through the list until the end
            current = current.getNext(); //go to the next one
        }
        System.out.println(counter.getIndex()); //print nodes
    }

    //INSERT: All shapes will be APPENDED (inserted at the end)
    public void insert(Shape shape) {
        ShapeNode node = new ShapeNode(shape);

        // if it's empty, insert at head
        if (isEmpty()) {
            head = node;
        } 
        
        //insert
        else {
            ShapeNode current = head; //start at the head
            while (current.getNext() != null) { //traverse the listt
                current = current.getNext(); //go to next node
            }
            current.setNext(node); //insert node
        }
        counter.add(); //increase counter
    }

    //REMOVE: delete the last node
    public void remove() {
        // if it's empty, return list is empty
        if (isEmpty()) {
            System.out.println("List is empty.");
            return;
        }

        // delete if there's only one node present
        if (head.getNext() == null) {
            head = null;
        }
        
        //remove the last node at the end of the list
        else {
            ShapeNode current = head; //start at the head
            while (current.getNext() != null && current.getNext().getNext() != null) { //traverse to the second to last node
                current = current.getNext(); //go to the next node
            }
            current.setNext(null); //remove node
        }
        counter.subtract(); //decrease counter
    }

    //DRAWSHAPES: draw all shapes
    public void drawShapes() {
        ShapeNode current = head; //start at the head
        while (current != null) { //traverse the list
            current.shape.draw(); //draw the shape
            current = current.getNext(); //move to the next node
        }
    }

    //CLEAR: delete everything and reset counter
    public void clear() {
        head = null; //clear list
        counter.reset(); //reset counter
    }

    
    //COUNTER METHODS
    //get index
    public int getIndex() {
        return counter.getIndex();
    }

    //toggle the counter
    public void toggleCounter(){
        counter.toggle();
    }

    //display the counter
    public void display() {
        counter.draw();
    }
}