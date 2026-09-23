package com.myapp;

public class App {
  public static void main(String[] args) {

    Server server = new Server();

    server.users = new java.util.LinkedList<>();

    server.addUser("Alice", "alice@mail.com");
    server.addUser("Bob", "bob@mail.com");
    server.addUser("Charlie", "charlie@mail.com");

    System.out.println("=== USERS ===");
    server.listUsers();

    User alice = server.users.get(0);
    User bob = server.users.get(1);

    server.sendMessage(alice, bob, "Hello Bob!");
    server.sendMessage(bob, alice, "Hi Alice!");

    System.out.println("\n=== ALICE INBOX ===");
    alice.showInbox();

    System.out.println("\n=== ALICE SENT ===");
    alice.showSent();

    System.out.println("\n=== BOB INBOX ===");
    bob.showInbox();

    server.deleteUser("charlie@mail.com");

    System.out.println("\n=== USERS AFTER DELETE ===");
    server.listUsers();

    server.sortUsers();

    System.out.println("\n=== USERS AFTER SORT ===");
    server.listUsers();

    try {
      server.addUser("Another Alice", "alice@mail.com");
    } catch (IllegalArgumentException e) {
      System.out.println("\nERROR: " + e.getMessage());
    }
  }
}
