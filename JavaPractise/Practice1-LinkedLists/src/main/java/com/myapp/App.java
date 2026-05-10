package com.myapp;

public class App {

  public static void main(String[] args) {
    testList l = new testList();
    l.addNode(1);
    l.addNode(2);
    l.addNode(3);
    l.addNode(4);
    l.addNode(5);
    l.addNode(6);
    l.addNode(7);
    l.addNode(8);

    l.printList();
    l.reverseInK(3);
    l.printList();
  }

}
