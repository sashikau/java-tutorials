package com.sashika;

import com.sashika.list.MyLinkedList;
import com.sashika.list.Node;

public class Main {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.insert(2);
        myLinkedList.insert(3);
        myLinkedList.insert(5);
        myLinkedList.insert(7);
        myLinkedList.insert(2);

//        myLinkedList.printList();

        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.get(0).getValue());
        System.out.println(myLinkedList.get(1).getValue());
        System.out.println(myLinkedList.get(2).getValue());
        System.out.println(myLinkedList.get(3).getValue());
        System.out.println(myLinkedList.get(4).getValue());
    }
}
