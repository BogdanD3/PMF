package com.myapp;

public class testList {
  Node head;

  public void printList() {
    Node current = head;
    while (current != null) {
      System.out.print(current.val + " ");
      current = current.next;
    }
    System.out.println();
  }

  public void addNode(int val) {
    Node newNode = new Node(val);
    if (head == null) {
      head = newNode;
      return;
    }
    Node current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = newNode;
  }

  public int size() {
    int count = 0;
    Node current = head;
    while (current != null) {
      count++;
      current = current.next;
    }
    return count;
  }

  private boolean kleft(Node cur, int k) {
    int n = 0;
    while (cur != null && n < k) {
      cur = cur.next;
      n++;
    }
    if (n == k)
      return true;
    else
      return false;
  }

  public void reverseInK(int k) {
    if (head == null || size() < k)
      return;

    Node cur = head;
    Node newHead = null;
    Node prevGroupEnd = null;

    while (kleft(cur, k)) {

      Node groupStart = cur;
      Node prev = null;
      int br = 0;

      while (br < k && cur != null) {
        Node next = cur.next;

        cur.next = prev;
        prev = cur;
        cur = next;

        br++;
      }

      if (newHead == null)
        newHead = prev;

      if (prevGroupEnd != null)
        prevGroupEnd.next = prev;

      prevGroupEnd = groupStart;
    }

    prevGroupEnd.next = cur;
    head = newHead;
  }

}
