package com.myapp;

public class Node {

  String owner;
  String bank;
  float amount;
  Node next;

  public Node(String owner, String bank, float amount) {
    this.owner = owner;
    this.bank = bank;
    this.amount = amount;
    this.next = null;
  }
}
