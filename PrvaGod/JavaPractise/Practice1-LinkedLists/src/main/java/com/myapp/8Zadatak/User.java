package com.myapp;

import java.util.LinkedList;

public class User {

  String name;
  LinkedList<User> followers;
  LinkedList<String> posts;

  public User(String name) {
    this.name = name;
    followers = new LinkedList<>();
    posts = new LinkedList<>();
  }

  public void listFollowers() {
    for (User user : followers) {
      System.out.println(user.name);
    }
  }

  public void showPosts() {
    for (String post : posts) {
      System.out.println(post);
    }
  }

  public void addPost(String val) {
    posts.add(val);
  }

  public void follow(User k) {
    k.followers.add(this);
  }

  public void unfollow(User k) {
    k.followers.remove(this);
  }

  public void findFans() {
    for (User follower : followers) {
      boolean followsBack = false;

      for (User f : follower.followers) {
        if (f.name.equals(this.name)) {
          followsBack = true;
          break;
        }
      }

      if (!followsBack) {
        System.out.println(follower.name);
      }
    }
  }

}
