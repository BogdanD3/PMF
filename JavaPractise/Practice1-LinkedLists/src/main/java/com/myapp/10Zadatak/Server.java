package com.myapp;

import java.util.LinkedList;

public class Server {

  LinkedList<User> users;

  public void listUsers() {
    for (User user : users) {
      System.out.println(user.name + ", " + user.email);
    }
  }

  public void sortUsers() {
    users.sort((u1, u2) -> u1.email.compareTo(u2.email));
  }

  public void addUser(String name, String email) {
    for (User user : users) {
      if (user.email.equals(email)) {
        throw new IllegalArgumentException("Email already exists: " + email);
      }
    }
    users.add(new User(name, email));
  }

  public void deleteUser(String email) {
    users.removeIf(user -> user.email.equals(email));
  }

  public void sendMessage(User sender, User reciever, String text) {
    sender.sent.add(text);
    reciever.inbox.add(text);
  }

}
