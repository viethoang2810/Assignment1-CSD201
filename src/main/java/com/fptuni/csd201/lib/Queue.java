/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fptuni.csd201.lib;

/**
 *
 * @author DUNGHUYNH
 */
public class Queue {
    Node head , tail ;
    public boolean isEmpty(){
        if(head == null)
            return true;
        return false ;
    }
    public void clear(){
        head = null ;
        tail = null ;
    }
    public void enqueue(int x){
        Node node = new Node(x);
        if(head == null){
            node.setInfo(x);
            head = node ;
        }else if(tail != null){
            tail.setNext(node);
        }
        tail = node;
    }
    public int dequeue(){
        int infor = 0 ;
        if(head != null){
            infor = head.getInfo() ;
            head = head.getNext() ;
        }
        return infor ;
    }
    public void traverse(){
        if(isEmpty() == true){
            System.out.println("Empty list");
        }
        Node a = head ;
        while(a != null){
            System.out.print(a.getInfo() + " ");
            a = a.next ;
        }
    }
}
