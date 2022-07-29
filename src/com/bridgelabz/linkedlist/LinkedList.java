package com.bridgelabz.linkedlist;

public class LinkedList <T>{

    Node<T> head;
    Node<T> tail;

    public void add(T data){
        Node<T> node = new Node<>(data);
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            node.previous = tail;
            tail.next = node;
            tail = node;
        }
    }

    public void display(){
        Node<T> temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public Node<T> search(T searchKey){
        Node<T> temp = head;
        while(temp != null){
            if(temp.data.equals(searchKey))
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public boolean insertAfter(T searchKey , T data){
        Node<T> node = new Node<>(data);
        Node<T> searchedElement = search(searchKey);
        if(searchedElement != null){
            node.previous = searchedElement;
            node.next = searchedElement.next;
            searchedElement.next = node;
            return true;
        }
        return false;
    }
}
