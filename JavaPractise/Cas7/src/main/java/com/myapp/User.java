package com.myapp;

import java.util.LinkedList;

public class User {

  String user;
  LinkedList<User> followers;
  LinkedList<String> posts;

  public User(String user) {
    this.user = user;
    this.followers = new LinkedList<User>();
    this.posts = new LinkedList<String>();
  }

  public void showFollowers() {
    for (User u : followers)
      System.out.print(u.user + " ");
    System.out.println();
  }

  public void showPosts() {
    for (String p : posts)
      System.out.println(p);
  }

  public void addFollower(User u) {
    followers.add(u);
  }

  public void addPost(String p) {
    posts.add(p);
  }

  public void Follow(User u) {
    u.followers.add(this);
  }

  public void Unfollow(User u) {
    u.followers.remove(this);
  }

  public void DoesHeFollowMe(User u1, User u2) {
    for (User u : u1.followers) {
      if (u.user.equals(u2.user)) {
        System.out.println("Yes, " + u2.user + " follows " + u1.user);
        return;
      }
    }
  }

  public void FindFans() {
    for (User u : followers) {
      if (!u.followers.contains(this))
        System.out.println(u.user);
    }
  }
}
