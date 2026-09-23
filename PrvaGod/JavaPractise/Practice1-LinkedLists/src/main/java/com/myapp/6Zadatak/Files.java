package com.myapp;

import java.util.HashSet;

public class Files {

  Node head;

  public void listFiles() {
    Node current = head;
    while (current != null) {
      System.out.println(current.name + "(" + current.val + ")");
      current = current.next;
    }
  }

  public void addFile(String name, String val) {
    Node newNode = new Node(name, val);
    if (head == null || head.name.compareTo(name) > 0) {
      newNode.next = head;
      head = newNode;
    } else {
      Node current = head;
      while (current.next != null && current.next.name.compareTo(name) < 0) {
        current = current.next;
      }
      newNode.next = current.next;
      current.next = newNode;
    }
  }

  public void findFile(String search) {
    Node current = head;
    while (current != null) {
      if (current.name.contains(search))
        System.out.println(current.name + "(" + current.val + ")");
      current = current.next;
    }
  }

  public void findDuplicates() {
    HashSet<String> seen = new HashSet<>();
    HashSet<String> printed = new HashSet<>();

    Node current = head;

    while (current != null) {
      if (seen.contains(current.val)) {
        if (!printed.contains(current.val)) {
          System.out.println("Duplicate content: " + current.val);
          printed.add(current.val);
        }
      } else {
        seen.add(current.val);
      }
      current = current.next;
    }
  }

}
