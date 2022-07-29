package com.bridgelabz.linkedlist;

public class MainClass {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(40);
        linkedList.add(30);
        linkedList.display();
        linkedList.insertAfter(30,50);
        linkedList.insertAfter(50,60);
        linkedList.insertAfter(40,20);
        System.out.println();
        linkedList.display();
    }
}
