package com.dlldemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
//        myDLL.append(2);
//        myDLL.append(3);
//        myDLL.insertNode(1,5);
//        myDLL.removeFrist();
//        myDLL.remove(3);
//        myDLL.removeSimilarOccurrences(3);
//        myDLL.insertNode(3,4);
//        myDLL.printList();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 1 for append a Node.");
        System.out.println("Type 2 for insert a Node.");
        System.out.println("Type 3 for remove a Node.");
        System.out.println("Type 4 for remove similar Nodes.");
        System.out.println("Type 5 for print list.");
        System.out.println("Type 6 to exit program.");

        boolean programExit = false;

        while (!programExit){
            System.out.print("Enter your choice: ");
            int userChoices = scanner.nextInt();

            switch (userChoices){
                case 1 -> {
                    System.out.print("Enter value to append: ");
                    int value = scanner.nextInt();
                    myDLL.append(value);
                }
                case 2 -> {
                    System.out.print("Enter value: ");
                    int value = scanner.nextInt();
                    System.out.print("Now enter the data to insert: ");
                    int data = scanner.nextInt();
                    myDLL.insertNode(value,data);
                }
                case 3 -> {
                    System.out.print("Enter value to remove: ");
                    int value = scanner.nextInt();
                    myDLL.remove(value);
                }
                case 4 -> {
                    System.out.print("Enter value to remove similar occurrences: ");
                    int value = scanner.nextInt();
                    myDLL.removeSimilarOccurrences(value);
                }
                case 5 -> {
                    myDLL.printList();
                }
                case 6 ->{
                    programExit = true;
                }
            }
        }



    }
}
