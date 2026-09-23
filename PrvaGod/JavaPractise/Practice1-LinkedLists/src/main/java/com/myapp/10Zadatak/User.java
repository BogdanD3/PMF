package com.myapp;

import java.util.LinkedList;

public class User {

  String name;
  String email;
  LinkedList<String> inbox;
  LinkedList<String> sent;

  public void showInbox() {
    for (String s : inbox)
      System.out.println(s);
  }

  public void showSent() {
    for (String s : sent)
      System.out.println(s);
  }

  public User(String name, String email) {
    this.name = name;
    this.email = email;
    inbox = new LinkedList<String>();
    sent = new LinkedList<String>();
  }
}
