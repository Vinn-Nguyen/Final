/*
 * Wren Nguyen
 * Project: Final
 * Manages the shapes and linked lists
*/

package com.code;

public class LinkedList {
    //VARIABLES
    public int index = 0; //counter
    public ShapeNode head;
    public ShapeNode next;

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

    public void print(){
        //if the list empty, return list is empty.
        if(isEmpty())
            System.out.println("List is empty.");
        
        ShapeNode current = head; //start at the head
        while (current != null){ //traverse through the list until the end
            System.out.println(index); //print nodes
            current = current.next;
        }
    }

    //INSERT: All shapes will be APPENDED (inserted at the end)
    public void insert (float x, float y){
        //creating a new node
        ShapeNode node = new ShapeNode(x, y);

        //if its empty, insert at end
        if(isEmpty()){
            head = node;
        }
        else{
            ShapeNode current = head;
            while(current.getNext()!= null){
                current = current.getNext();
            }
            current.setNext(node);
            index++; //increase the index
        }
    }

    //get node
    public ShapeNode getNode(int index){
        ShapeNode current = head;
        for(int i = 0; i<index; i++){
            current = current.next;
        }
        return current;
    }

}
