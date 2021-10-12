/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fptuni.csd201.marsmessenger;

import com.fptuni.csd201.object.MessagePackage;

/**
 *
 * @author Admin
 */
public class NewNode {
    MessagePackage pk ;
    NewNode next = null ;

    NewNode() {
        
    }

     NewNode(MessagePackage pk, NewNode next) {
        this.pk = pk;
        this.next = next;
    }

     NewNode(MessagePackage pk) {
        this.pk = pk;
    }

    public MessagePackage getPk() {
        return pk;
    }

    public void setPk(MessagePackage pk) {
        this.pk = pk;
    }

    public NewNode getNext() {
        return next;
    }

    public void setNext(NewNode next) {
        this.next = next;
    }

    @Override
   public String toString(){
       return "" ;
   }
}

