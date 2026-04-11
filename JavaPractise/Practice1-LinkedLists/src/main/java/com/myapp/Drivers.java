package com.myapp;

public class Drivers {

  Node head;
  Node tail;
  int nodes;

  private int countWins(int[] scores) {
    int wins = 0;

    for (int i = 0; i < scores.length; i++) {
      if (scores[i] == 1) {
        wins++;
      }
    }

    return wins;
  }

  public void listDrivers() {
    Node current = head;
    while (current != null) {
      System.out
          .println(
              "Name: " + current.val.name + " Team: " + current.val.team + " Wins: " + countWins(current.val.ranks));
      current = current.next;
    }
  }

  public void addDriver(Driver b) {
    Node newNode = new Node(b);
    if (head == null || head.val.compareTo(b) < 0) {
      newNode.next = head;
      head = newNode;
      if (tail == null)
        tail = newNode;
      nodes++;
      return;
    }

    Node current = head;
    while (current.next != null && current.next.val.compareTo(b) > 0) {
      current = current.next;
    }
    newNode.next = current.next;
    current.next = newNode;
    if (newNode.next == null)
      tail = newNode;
    nodes++;
  }

  public void delete(String name) {
    if (head == null)
      return;

    while (head != null && head.val.name.equals(name)) {
      head = head.next;
      nodes--;
    }

    if (head == null) {
      tail = null;
      return;
    }

    Node prev = head;
    Node current = head.next;

    while (current != null) {
      if (current.val.name.equals(name)) {
        prev.next = current.next;
        nodes--;

        if (current == tail) {
          tail = prev;
        }

        current = prev.next;
      } else {
        prev = current;
        current = current.next;
      }
    }
  }
}
