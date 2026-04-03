package com.myapp;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {
    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(4);
    Node node5 = new Node(5);
    Node node6 = new Node(6);
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;
    node5.next = node6;
    List l1 = new List();
    l1.head = node1;

    Words l2 = new Words();
    l2.head = new Node2("Ananas");
    l2.head.next = new Node2("Banana");
    l2.head.next.next = new Node2("Coconut");
    l2.head.next.next.next = new Node2("Durian");
    

    // l1.StampajListu();
    // System.out.println();
    // l1.Dodaj1();
    // l1.StampajListu();
    // System.out.println();
    // l1.Dodaj2(2);
    // l1.StampajListu();
    // System.out.println();
    // l1.Dodaj3(1, 4);
    // l1.StampajListu();
    // System.out.println();
    // l1.Dodaj4(2, 69);
    // l1.StampajListu();
    // System.out.println();
    // l1.Obrisi(1, 1);
    // l1.StampajListu();
    // System.out.println();
    // System.out.println(l1.PronadjiSredinu());
    // System.out.println();
    

    l2.StampajListu();
    System.out.println();
    l2.DodajRec("Kivi");
    l2.StampajListu();
    System.out.println();
    l2.Obrisi("Kivi", 1);
    l2.StampajListu();
    System.out.println();
  }
}
