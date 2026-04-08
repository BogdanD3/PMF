package com.myapp;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {

    Node1 n1 = new Node1(6);
    Node1 n2 = new Node1(2);
    Node1 n3 = new Node1(3);
    Node1 n4 = new Node1(5);
    Node1 n5 = new Node1(1);
    Node1 n6 = new Node1(4);

    n1.next = n2;
    n2.prev = n1;
    n2.next = n3;
    n3.prev = n2;
    n3.next = n4;
    n4.prev = n3;
    n4.next = n5;
    n5.prev = n4;
    n5.next = n6;
    n6.prev = n5;

    MyList list = new MyList();
    list.head = n1;

    Node1 n21 = new Node1(6);
    Node1 n22 = new Node1(2);
    Node1 n23 = new Node1(3);
    Node1 n24 = new Node1(5);
    Node1 n25 = new Node1(1);
    Node1 n26 = new Node1(4);

    n21.next = n22;
    n22.prev = n21;
    n22.next = n23;
    n23.prev = n22;
    n23.next = n24;
    n24.prev = n23;
    n24.next = n25;
    n25.prev = n24;
    n25.next = n26;
    n26.prev = n25;

    MyList list2 = new MyList();
    list2.head = n21;

    list.printList();
    System.out.println();
    // list.addOne();
    // list.printList();
    // System.out.println();
    // list.addTwo(2);
    // list.printList();
    // System.out.println();
    // list.addThree(2, 5);
    // list.printList();
    // System.out.println();
    // list.addFour(2, 0);
    // list.printList();
    // System.out.println();
    // list.remove(2, 2);
    // list.printList();
    // System.out.println();
    // list.findMiddle();
    // System.out.println();
    // list.reorder(2);
    // list.printList();
    // System.out.println();
    // list.reorder2(3);
    // list.printList();
    // System.out.println();
    // list.sortList(false);
    // list.printList();
    // System.out.println();
    list.joinLists(list2);
    list.printList();
    System.out.println();
  }
}
