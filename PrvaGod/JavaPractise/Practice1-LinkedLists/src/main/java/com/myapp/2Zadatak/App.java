package com.myapp;

public class App {

  public static void main(String[] args) {

    Node n1 = new Node("Apple");
    Node n2 = new Node("Banana");
    Node n3 = new Node("Cherry");
    Node n4 = new Node("Date");
    Node n5 = new Node("Elderberry");

    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;

    Words list = new Words();
    list.head = n1;

    list.printList();
    System.out.println();
    list.add("Fig");
    list.printList();
    System.out.println();
    list.delete("Aaaaa", 4);
    list.printList();
    System.out.println();
  }

}
