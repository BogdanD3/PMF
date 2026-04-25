package com.myapp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Bills {

  Node head;

  public void listBills() {
    Node current = head;
    while (current != null) {
      System.out.println(current.owner + " - " + current.bank + " (" + current.amount + ")");
      current = current.next;
    }
  }

  public void addBill(String owner, String bank, float amount) {
    Node newNode = new Node(owner, bank, amount);
    if (head == null || head.amount > amount) {
      newNode.next = head;
      head = newNode;
      return;
    }
    Node current = head;
    while (current.next != null && current.next.amount < amount) {
      current = current.next;
    }
    newNode.next = current.next;
    current.next = newNode;
  }

  public void findBills(String s1, String s2) {
    Node current = head;
    while (current != null) {
      if (current.owner.contains(s1) && current.bank.contains(s2)) {
        System.out.println(current.owner + " - " + current.bank + " (" + current.amount + ")");
      }
      current = current.next;
    }
  }

  public void pronadjiVlasnike() {
    HashMap<String, Set<String>> map = new HashMap<>();

    Node current = head;

    while (current != null) {
      map.putIfAbsent(current.owner, new HashSet<>());
      map.get(current.owner).add(current.bank);

      current = current.next;
    }

    for (String owner : map.keySet()) {
      if (map.get(owner).size() > 1) {
        System.out.println(owner);
      }
    }
  }

}
