package com.myapp;

public class Words {
  Node2 head;

  public void StampajListu() {
    Node2 current = this.head;
    while (current != null) {
      System.out.print(current.val + " ");
      current = current.next;
    }
  }

  public void DodajRec(String rec) {
    Node2 node = new Node2(rec);
    if (this.head == null) {
      this.head = node;
      return;
    }
    Node2 tail = this.head;
    Node2 current = this.head.next;

    while (current != null) {
      String wordL = tail.val;
      String wordR = current.val;
      if (wordL.equals(rec) || wordR.equals(rec))
        return;
      if (wordL.charAt(0) <= rec.charAt(0) && wordR.charAt(0) > rec.charAt(0)) {
        node.next = current.next;
        current.next = node;
        current = node.next;
        return;
      } else if (current.next == null && current.val.charAt(0) < rec.charAt(0)) {
        current.next = node;
        return;
      } else {
        current = current.next;
      }
    }
  }

  private static int difference(boolean[] list, String str) {
    int counter = 0;
    boolean comp[] = new boolean[128];
    for (int i = 0; i < str.length(); i++) {
     comp[str.charAt(i)] = true;
    }
    for (int i = 0; i < 128; i++) {
      if (list[i] != comp[i]) counter++;
    }
    return counter;
  }

  public void Obrisi(String d, int k) {
    boolean list[] = new boolean[128];
    for (int i = 0; i < d.length(); i++) {
      list[d.charAt(i)] = true;
    }
    Node2 dummy = new Node2("");
    dummy.next = this.head;

    Node2 tail = dummy;
    Node2 current = this.head;
    while (current != null) {
      if (difference(list, current.val) > k) {
        tail.next = current.next;
        current = current.next;
      } 
      else {
        tail = current;
        current = current.next;
      }
    }
    this.head = dummy.next; 
  }
}
