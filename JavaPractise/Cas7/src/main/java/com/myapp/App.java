package com.myapp;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {
    Node c7 = new Node("Bogdan", "CKB", -2.5f);
    Node c6 = new Node("Milivoje", "Addiko", 2.2f);
    Node c5 = new Node("Bojke", "Prva Crnogoska", 100);
    Node c4 = new Node("Drunked", "Erste", 345);
    Node c3 = new Node("Anto", "Neka Ulcinjska", 1000);
    Node c2 = new Node("Nevena", "Lovcen", 3257);
    Node c1 = new Node("Djuri", "NLB", 10456);

    c1.next = c2;
    c2.next = c3;
    c3.next = c4;
    c4.next = c5;
    c5.next = c6;
    c6.next = c7;

    Bills bill = new Bills();
    bill.head = c1;

    bill.printBills();
    System.out.println("");
    bill.addBill("Petar", "NLB", -500);
    bill.addBill("Milos", "Lovc", 100000);
    bill.addBill("Petar", "Lovcen", 100000);
    bill.addBill("Djuri", "NLB", 100000);
    bill.printBills();
    System.out.println("");
    bill.findBills("Anto", "a");
    System.out.println("");
    bill.findHolders();
    System.out.println("");
  }
}
