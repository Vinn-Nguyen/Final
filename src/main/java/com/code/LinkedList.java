/*
 * Wren Nguyen
 * Project: Final
 * Manages the nodes (and their functions) and stores the shape info
*/

package com.code;

public class LinkedList {
    //VARIABLES
    public int index = 0; //counter
    public ShapeNode head; //head of the list

    boolean isUndo = false;

    public LinkedList(){
        head = null;
    }

    //ISEMPTY: checks if the list is empty
    boolean isEmpty(){ 
        return head == null;
    }

    //INDEX/COUNTER
    public int getIndex(){
        return index;
    }

    //PRINT: print the index
    public void print(){
        //if the list empty, return list is empty.
        if(isEmpty())
            System.out.println("List is empty.");
        
        ShapeNode current = head; //start at the head
        while (current != null){ //traverse through the list until the end
            current = current.getNext(); //go to the next one
        }
        System.out.println(index); //print nodes

    }

    //INSERT: All shapes will be APPENDED (inserted at the end)
    public void insert (Shape shape){
        //creating a new node
        ShapeNode node = new ShapeNode(shape);

        //if its empty, insert at head
        if(isEmpty()){
            head = node;
        }

        //insert at end
        else{
            ShapeNode current = head; //start at head
            while(current.getNext()!= null){ //traverse the list
                current = current.getNext(); //go to the next
            }
            current.setNext(node); //set the node
        }
        index++; //increase the index
    }

    //delete the last node
    void remove(){
        //if its empty return "List is empty."
        if(isEmpty()){
            System.out.println("List is empty.");
        }

        //if there's only one shape
        if(head.getNext() == null){
            head = null;
            return;
        }
        else {
            ShapeNode current = head; //start at the head
            while (current.getNext() != null && 
            current.getNext().getNext() != null){ //traverse list to the second to last node
                current = current.getNext(); //find node
            }
            current.setNext(null); //remove node
        }
        index--; //decrease index
    }

    //draw
    void drawShapes(){
        ShapeNode current = head; //start at the head
        while(current != null){ //traverse the list
            current.shape.draw(); //draw the current shape
            current = current.getNext(); //go to the next one
        }
    }
}
