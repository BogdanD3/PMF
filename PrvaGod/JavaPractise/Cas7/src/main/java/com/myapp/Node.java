package com.myapp;

public class Node {
  String holder;
  String bank;
  float val;
  Node next;

  public Node(String holder, String bank, float val) {
    this.holder = holder;
    this.bank = bank;
    this.val = val;
    this.next = null;
  }

}
