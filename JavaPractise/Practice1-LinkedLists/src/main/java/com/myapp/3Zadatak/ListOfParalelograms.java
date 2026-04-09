package com.myapp;

public class ListOfParalelograms {

  Node head;

  public void printList() {
    if (this.head == null) {
      System.out.println("The list is empty.");
      return;
    }
    Node current = this.head;
    while (current != null) {
      System.out.println(current.val + ", ");
      current = current.next;
    }
  }

  public void add(Paralelogram p) {
    Node newNode = new Node(p);
    if (this.head == null || this.head.val.compareTo(p) > 0) {
      newNode.next = this.head;
      this.head = newNode;
      return;
    }
    Node current = this.head;
    while (current.next != null && current.next.val.compareTo(p) < 0) {
      current = current.next;
    }
    newNode.next = current.next;
    if (current.next != null)
      current.next.prev = newNode;
    current.next = newNode;
    newNode.prev = current;
  }

  public void delete(double a, double b) {
    if (this.head == null) {
      return;
    }

    Node current = this.head;
    while (current != null) {
      if (current.val.surface() > a && current.val.surface() < b) {
        if (current == this.head) {
          this.head = current.next;
          if (this.head != null) {
            this.head.prev = null;
          }
        } else {
          Node prev = current.prev;
          Node next = current.next;
          prev.next = next;
          if (next != null)
            next.prev = prev;
        }
      }
      current = current.next;
    }

  }

}
