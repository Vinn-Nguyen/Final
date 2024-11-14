/*
 * Wren Nguyen
 * Project: Final
 * Manages the nodes (and their functions) into the linked lists
*/

package com.code;

public class LinkedList {
    //VARIABLES
    public int index = 0; //counter
    public ShapeNode head; //head of the list
    public ShapeNode next; //next node in the list

    public LinkedList(){
        head = null;
        next = null;
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
            System.out.println(index); //print nodes
            current = current.next; //go to the next one
        }
    }

    //INSERT: All shapes will be APPENDED (inserted at the end)
    public void insert (Shape shape){
        //creating a new node
        ShapeNode node = new ShapeNode(shape);

        //if its empty, insert at head
        if(isEmpty()){
            head = node;
        }
        else{
            ShapeNode current = head; //start at head
            while(current.getNext()!= null){ //traverse the list
                current = current.getNext(); //go to the next
            }
            current.setNext(node); //set the node
            index++; //increase the index
        }
    }

    //draw
    void drawShapes(){
        ShapeNode current = head; //start at the head
        while(current != null){ //traverse the list
            current.shape.draw(); //draw the current shape
            current = current.next; //go to the next one
        }
    }

}
