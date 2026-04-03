package com.myapp;

import java.util.HashMap;
import java.util.HashSet;

public class Bills {
  Node head;

  public void printBills() {
    Node current = this.head;
    while (current != null) {
      System.out.println(current.holder + "-" + current.bank + " (" + current.val + "€)");
      current = current.next;
    }
  }

  public void addBill(String holder, String bank, float value) {
    Node newNode = new Node(holder, bank, value);

    if (head == null || head.val <= value) {
      newNode.next = head;
      head = newNode;
      return;
    }

    Node curr = head;
    while (curr.next != null && curr.next.val > value) {
      curr = curr.next;
    }
    newNode.next = curr.next;
    curr.next = newNode;
  }

  public void findBills(String text1, String text2) {
    Node current = this.head;
    if (this.head == null) {
      System.out.println("Ne postoji ni jedan racun");
      return;
    }
    while (current != null) {
      if (current.holder.contains(text1) && current.bank.contains(text2))
        System.out.println(current.holder + "-" + current.bank + " (" + current.val + "€)");
      current = current.next;
    }
  }

  public void findHolders() {
    HashMap<String, HashSet<String>> vlasnici = new HashMap<>();
    Node current = head;

    while (current != null) {
      vlasnici.computeIfAbsent(current.holder, k -> new HashSet<>()).add(current.bank);
      current = current.next;
    }

    for (String holder : vlasnici.keySet()) {
      if (vlasnici.get(holder).size() > 1) {
        System.out.println(holder);
      }
    }
  }

}
