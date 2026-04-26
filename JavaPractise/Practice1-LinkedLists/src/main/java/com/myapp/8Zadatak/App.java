package com.myapp;

public class App {
  public static void main(String[] args) {

    // Kreiranje korisnika
    User user1 = new User("Alice");
    User user2 = new User("Bob");
    User user3 = new User("Charlie");
    User user4 = new User("Diana");

    // Testiranje follow
    user1.follow(user2); // Alice prati Bob-a
    user3.follow(user2); // Charlie prati Bob-a
    user4.follow(user2); // Diana prati Bob-a

    user2.follow(user1); // Bob prati Alice (nije fan)
    // Charlie i Diana NEĆE biti praćeni nazad → fanovi

    // Testiranje objava
    user1.addPost("Hello world!");
    user1.addPost("My second post");

    user2.addPost("Bob's first post");

    // Prikaz objava
    System.out.println("=== POSTS ===");
    user1.showPosts();
    user2.showPosts();

    // Prikaz pratilaca
    System.out.println("\n=== FOLLOWERS OF BOB ===");
    user2.listFollowers();

    // Testiranje fanova
    System.out.println("\n=== FANS OF BOB ===");
    user2.findFans();

    // Testiranje unfollow
    user3.unfollow(user2); // Charlie otpraćuje Bob-a

    System.out.println("\n=== FOLLOWERS OF BOB AFTER UNFOLLOW ===");
    user2.listFollowers();

    // Ponovo fanovi
    System.out.println("\n=== FANS OF BOB AFTER UNFOLLOW ===");
    user2.findFans();
  }
}
