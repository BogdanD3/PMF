package com.myapp;

import java.util.HashMap;

public class Files {

  Node2 head;

  public void printFiles() {
    Node2 current = this.head;
    while (current != null) {
      System.out.println(current.name + " (" + current.content + ")");
      current = current.next;
    }
  }

  public void addFile(String ime_fajla, String sadrzaj) {
    Node2 newNode = new Node2(ime_fajla, sadrzaj);

    if (head == null || head.name.compareTo(newNode.name) > 0) {
      newNode.next = head;
      head = newNode;
      return;
    }
    Node2 current = head;
    while (current.next != null && current.next.name.compareTo(newNode.name) < 0) {
      current = current.next;
    }

    newNode.next = current.next;
    current.next = newNode;
  }

  public void findFile(String search) {
    Node2 current = this.head;
    while (current != null) {
      if (current.name.contains(search))
        System.out.println(current.name + " (" + current.content + ")");
      current = current.next;
    }
  }

  public void findDupes() {
    HashMap<String, Integer> map = new HashMap<>();
    Node2 current = this.head;
    while (current != null) {
      String key = current.content;
      if (map.containsKey(key)) {
        map.put(key, map.get(key) + 1);
      } else
        map.put(key, 1);
      current = current.next;
    }
    for (String k : map.keySet()) {
      if (map.get(k) > 1)
        System.out.println(k);
    }
  }
}
