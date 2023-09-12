package com.dlldemo;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.Currency;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + (temp.next != null ? "-> " : "\n" ));
            temp = temp.next;
        }
    }

    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void removeFrist(){
        Node temp = head;
        if (head.next == null){
            head = null;
            tail = null;
            System.out.println("the list is empty there is nothing to delete");
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
    }

    public void remove(int value) {
//       if (head.value == value) {
//           removeFrist();
//       }
//       Node temp = new Node(value);
//       temp.next.prev = temp.prev;
//       temp.prev.next = temp.next;
//       temp.next = null;
//       temp.prev = null;

        Node currentNode = head;
        Node previousNode = null;
        Node afterNode = currentNode.next;

        if (currentNode != null && currentNode.value == value) {
            removeFrist();
            return;
        }
        while (currentNode != null && currentNode.value != value) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        if (currentNode != null) {
            previousNode.next = currentNode.next;
            afterNode.prev = currentNode.prev;
            currentNode = null;
        }

    }

    public void removeSimilarOccurrences(int value){
        Node currentNode = head;
        Node previousNode = null;
        Node afterNode = currentNode.next;

        if (currentNode != null && currentNode.value == value){
            removeFrist();
            return;
        }
        while (currentNode != null){
            if(currentNode.value  ==  value){
                if(previousNode != null){
                    previousNode.next = currentNode.next;
                    afterNode.prev = currentNode.prev;
                }

            }else {
                previousNode = currentNode;
            }
            currentNode = currentNode.next;
        }

    }

    public void insertNode(int value, int data) {
        Node newNode = new Node(data);
        Node currentNode = head;
        Node previousNode = null;

        if (currentNode != null && currentNode.value == value){
            head.prev = newNode;
            head = newNode;
            newNode.next = currentNode;
            return;
        }
        while(currentNode != null && currentNode.value != value){
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        if(currentNode != null){
            newNode.prev = previousNode;
            newNode.next = currentNode;
            previousNode.next = newNode;
            currentNode.prev = newNode;
        }

    }
// new comit
}
