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
        else{
            ShapeNode current = head; //start at head
            while(current.getNext()!= null){ //traverse the list
                current = current.getNext(); //go to the next
            }
            current.setNext(node); //set the node
            index++; //increase the index
        }
    }

    //delete the last node
    void undo(Shape shape){
        //if its empty return "List is empty."
        if(isEmpty() && isUndo == true){
            System.out.println("List is empty.");
        }
        else if(isUndo == true){
        ShapeNode current = head; //start at the head
        ShapeNode previous = null; //init previous
        while(current.getNext() != null){ //traverse the list
            previous = current; //store current into previous
            current = current.getNext(); //go to the next node
        }
        previous.setNext(current.getNext()); //replace the previous with the current
        index--;
        }
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
