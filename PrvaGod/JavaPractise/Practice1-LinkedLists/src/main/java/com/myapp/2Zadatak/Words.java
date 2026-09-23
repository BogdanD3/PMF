package com.myapp;

public class Words {

  Node head;

  public void printList() {
    Node current = head;
    while (current != null) {
      System.out.println(current.word + ", ");
      current = current.next;
    }
  }

  public void add(String t) {
    if (head == null || head.word.compareTo(t) > 0) {
      if (head != null && head.word.equals(t))
        return;
      Node node = new Node(t);
      node.next = head;
      head = node;
      return;
    }
    Node current = head;
    while (current.next != null && current.next.word.compareTo(t) < 0) {
      current = current.next;
    }
    if (current.next != null && current.next.word.equals(t)) {
      return;
    }
    Node node = new Node(t);
    node.next = current.next;
    current.next = node;
  }

  private int differences(String a, String b) {
    int min = Math.min(a.length(), b.length());
    int count = 0;

    for (int i = 0; i < min; i++) {
      if (a.charAt(i) != b.charAt(i)) {
        count++;
      }
    }
    count += Math.abs(a.length() - b.length());

    return count;
  }

  public void delete(String d, int k) {
    while (head != null && differences(head.word, d) > k) {
      head = head.next;
    }

    if (head == null)
      return;

    Node current = head;

    while (current.next != null) {
      if (differences(current.next.word, d) > k) {
        current.next = current.next.next;
      } else {
        current = current.next;
      }
    }
  }
}
