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
public class LinkedListMars {

    private NewNode head, tail;

    public void addToTail(MessagePackage pk) {
        boolean check = checkDuplicatePackage(pk);
        NewNode node = new NewNode(pk);

            if (tail != null) {
                tail.setNext(node);
            }
            tail = node;
            if (head == null) {
                head = node;
        }
    }


    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public String printMsg() {
        if(head == null){
            return "nothing" ;
        }else{
            NewNode node = head;
            while (node != null) {
                NewNode tmp = node.next;
                while (tmp != null) {
                    if (node.getPk().getIndex() > tmp.getPk().getIndex()) {
                        MessagePackage a = node.pk;;
                        node.pk = tmp.pk;
                        tmp.pk = a;
                    }
                    tmp = tmp.next;
                }
                node = node.next;
            }
//            NewNode current = head;
//            NewNode next = null ;
//            if(current == null){
//                return null ;
//            }else{
//                while(current != null){
//                    next = current.getNext();
//                        while(next != null && (current.getPk().getIndex() == next.getPk().getIndex())){
//                            next = next.getNext();
//                        }
//                        current = current.getNext();
//                }
//            }
            NewNode firtNode = head ;
            String message = "";
            System.out.println("\nThe order of packages after recevie: ");
            while (firtNode != null) {
                System.out.println(firtNode.getPk());
                message = message.concat(firtNode.getPk().getContent());
                firtNode = firtNode.next;
            }
            return message ;
        }
    }
    
    public int CheckMaxIndex() {
        NewNode current = head;
        int max = 0;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            max = head.getPk().getIndex();

            while (current != null) {
                if (max < current.getPk().getIndex()) {
                    max = current.getPk().getIndex();
                }
                current = current.next;
            }

        }
        return max;
    }
   

    public boolean search(int x) {
        NewNode node = head;
        while (node != null) {
            if (node.getPk().getIndex() == x) {
                return true;
            }
            node = node.next;
        }
        return false;
    }
    public boolean checkDuplicatePackage(MessagePackage msg){
           NewNode check = head ;
           while(check != null){
               if(msg.getIndex() == check.getPk().getIndex()){
                   msg = check.getPk();
                   return false ;
               }
               check = check.getNext();
           }
        return true ;
    }
}
