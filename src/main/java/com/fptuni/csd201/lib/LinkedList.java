package com.fptuni.csd201.lib;

public class LinkedList {

    private Node head, tail;

    public LinkedList() {
        head = null;
        tail = null;

    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void clear() {
        head = null;
        tail = null;
    }

    // null exception
    // head & tail is correct
    
    
//    1. `void addToHead(int x)` - add a node with value x  at the head of  a list.
    public void addToHead(int x) {
        Node node = new Node(x);
        node.setInfo(x);

        node.setNext(head);
        head = node;

        if (tail == null) {
            tail = node;
        }

    }

//2. `void addToTail(int x)` - add a node with value x  at the tail of  a list.
    
    public void addToTail(int x) {
        
        //create node
        Node node = new Node(x);
        node.setInfo(x);

        //set node      
        
        if (tail != null) {
            tail.setNext(node);
        }
        tail = node;

        if (head == null) {
            head = node;
        }

    }
    
 // void addAfter(index i, int x)
//3. `void addAfter(Node p, int x)` - add a node with value x  after the node p.

    public void addAfter(Node p, int x) {

        Node node = new Node(x);
        node.setInfo(x);

        //node.setNext(p.getNext());
        //p.setNext(node);
        
        if (p != null) {
            node.setNext(p.getNext());
            p.setNext(node);
        }
        
        // ==
        // equals
        
        // head & tail
        if (p == tail){
            tail = node;
        }
    }

//4. `void traverse()` - traverse from head to tail and dislay info of all nodes in the list.
    public void traverse() {

        Node node = head;
        // tail.next is always null
        while (node != null) {
            System.out.print(node.getInfo() + " ");
            node = node.next;
        }
    }

//5. `int deleteFromHead()` - delete the head and return its info.
    public int deleteFromHead() {
        int info = 0;

        if (head == null) {
            return 0;
        } else {

            info = head.getInfo();
            head = head.getNext();
        }

        if (head == null) {
            tail = null;
        }

        return info;

    }
//6. `int deleteFromTail()` - delete the tail and return its info.

    public int deleteFromTail() {

        int info = 0;
        
//          info = tail.getInfo();
//
//            Node pre = head;
//            while ( pre.getNext() != tail) {
//                pre = pre.getNext();
//            }
//            pre.setNext(null);
//            tail = pre;
        

        if (tail == null) {
            return 0;

            //only one node
        } else if (head == tail) {

            info = tail.getInfo();
            head = null;
            tail = null;

            // two nodes above   
        } else {

            info = tail.getInfo();

            Node pre = head;
            while (pre != null && pre.getNext() != tail) {
                pre = pre.getNext();
            }
            pre.setNext(null);
            tail = pre;
        }
        return info;

    }
    
//7. `int deleteAter(Node p)` - delete the node after the node  p  and return its info.

    public int deleteAter(Node p) {
        int info = 0;

        if (p == null || p == tail) {
            return 0;
        } else {
            if (p != null) {
                info = p.getNext().getInfo();

                if (p.getNext() != null) {
                    p.setNext(p.getNext().getNext());
                } else {
                    p.setNext(null);
                }

            }
            return info;
        }
    }

//8. `void dele(int x)` - delele the first node whose info is equal to  x.
    public void dele(int x) {

        int info = 0;

        if (tail == null) {
            return;

            //only one node
        } else if (head == tail) {

            if (x == head.getInfo()) {
                head = null;
                tail = null;
            }

            // two nodes above   
        } else {

            Node pre = head;
            while (pre != null && pre.getNext() != tail && x != pre.getNext().getInfo()) {
                pre = pre.getNext();
            }
            pre.setNext(pre.getNext().getNext());

            if (pre.getNext() == null) {
                tail = pre;
            }
        }

    }

//9. `Node search(int x)` - search and return the reference to the first node having info x.
    public Node search(int x) {

        Node node = head;
        // tail.next is always null
        while (node != null) {
            if (node.getInfo() == x) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

//10. `int count()` - count and return number of nodes in the list.
    public int count() {
        int count = 0;
        Node node = head;
        // tail.next is always null
        while (node != null) {
            count++;
            node = node.getNext();
        }
        return count;
    }
//11. `void dele(int i)` - delete an i-th node on the list. Besure that such a node exists.
//12. `void sort()` - sort the list by ascending order of info.
//13. `void remove(Node p)` - delete node p if it exists in the list.
//14. `int [] toArray()` - create and return array containing info of all nodes in the list.
//15. Merge two ordered singly linked lists of integers into one ordered list.
//16. `void addBefore(Node p, int x)` - add a node with value x  before the node p.
//17. Attach a singly linked list to the end of another singly linked list.
//18. `int max()` - find and return the maximum value in the list. 
//19. `int min()` - find and return the minimum value in the list. 
//20. `int sum()` - return the sum of all values in the list. 
//21. `int avg()` - return the average of all values in the list.
//22. `boolean sorted()` - check and return true if the list is sorted, return false if the list is not sorted.
//23. `void insert(int x)` - insert node with value x into sorted list so that the new list is sorted.
//24. Reverse a singly linked list using only one pass through the list.
//25. Check whether two singly linked list have the same contents.    

}
