package com.myapp;

public class Node {

  Worker val;
  Node next;
  Node prev;

  public Node(Worker val) {
    this.val = val;
    this.next = null;
    this.prev = null;
  }

}
