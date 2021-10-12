/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fptuni.csd201.marsmessenger;

import com.fptuni.csd201.object.MessagePackage;


/**
 *
 * @author DUNGHUYNH
 */
public class MessageReceiverImpl implements MessageReceiver {
    LinkedListMars list = new LinkedListMars();
    MessagePackage msg = new MessagePackage() ;
    @Override
    public void receive(MessagePackage pck) {
        
        System.out.println("Index: " + pck.getIndex() + " - " + pck.getContent());
        // STUDENT DEVELOPS CODE HERE
        list.addToTail(pck);
    }

    @Override
    public String getMessage() {
        // STUDENT DEVELOPS CODE HERE
        if (list.isEmpty() == false) {
            String mes = list.printMsg();
            return mes;
        }
        return "nothing";
    }

    @Override
    public int[] getMissingIndex() {
        // STUDENT DEVELOPS CODE HERE
        int maxIndex = list.CheckMaxIndex();
          int b = 0;
          int c = 0;
          int a[] = new int[maxIndex];

          for (int i = 0; i <= maxIndex; i++) {
              if (list.search(i) == false) {
                  a[b] = i;
                  b++;
                  c++;
              }
          }
          int d[] = new int[c];
 
          for (int i = b; i >= 0; i--) {
              if (a[i] == 0) {
                  maxIndex--;
              }
              break;
          }
          for (int i = 0; i < c; i++) {
              d[i] = a[i];
            }
          return d;
        }    
}
