package com.myapp;

public class List {

  Node head;

  public void StampajListu() {
    Node current = this.head;
    while (current != null) {
      System.out.print(current.val + " ");
      current = current.next;
    }
  }

  public void Dodaj1() {
    Node left = this.head;
    Node right = this.head.next;
    while (right != null) {
      Node node = new Node(left.val - right.val);
      node.next = left.next;
      left.next = node;
      left = right;
      right = right.next;
    }
  }

  public void Dodaj2(int k) {
    if (k == 0) {
      System.out.println("Ne moze se dijeliti sa 0");
      return;
    }
    Node current = this.head;

    while (current != null) {
      if (current.val % k == 0) {
        Node node = new Node(-1);
        node.next = current.next;
        current.next = node;
        current = node.next;
      } else {
        current = current.next;
      }
    }
  }

  public void Dodaj3(int a, int b) {
    Node current = this.head;
    while (current != null) {
      if (current.val > a && current.val < b) {
        Node node = new Node(0);
        node.next = current.next;
        current.next = node;
        current = node.next;
      } else
        current = current.next;
    }
  }

  public void Dodaj4(int k, int v) {
    Node current = this.head;
    int counter = 1;

    while (current != null) {
      if (counter == k) {
        Node node = new Node(v);
        node.next = current.next;
        current.next = node;
        current = node.next;
        counter = 1;
      } else {
        current = current.next;
        counter++;
      }
    }
  }

  public void Obrisi(int d, int k) {
    Node dummy = new Node(0);
    dummy.next = this.head;

    Node prev = dummy;
    Node current = this.head;

    while (current != null) {
      if (Math.abs(current.val - d) < k) {
        prev.next = current.next; 
      } else {
        prev = current;
      }
      current = current.next;
    }

    this.head = dummy.next;
  }

  public String PronadjiSredinu() {
    Node current = this.head;
    Node jumper = this.head.next;
  
    while (jumper != null) {
      if (jumper.next == null) {
        return "Sredina su: " + current.val + " and " + current.next.val;
      }
      if (jumper.next.next == null) {
        return "Sredina je: " + current.next.val;
      }
      current = current.next;
      jumper = jumper.next.next;
    }
    return "Nesto poslo po zlu";
  }
}
