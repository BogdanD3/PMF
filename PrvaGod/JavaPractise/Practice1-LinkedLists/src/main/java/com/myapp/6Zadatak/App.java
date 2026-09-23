package com.myapp;

public class App {

  public static void main(String[] args) {

    Files files = new Files();

    files.addFile("b.txt", "123");
    files.addFile("a.txt", "abc");
    files.addFile("c.txt", "123");
    files.addFile("d.txt", "xyz");
    files.addFile("aa.txt", "abc");

    System.out.println("=== ALL FILES (SORTED) ===");
    files.listFiles();

    System.out.println("\n=== FIND FILES containing 'a' ===");
    files.findFile("a");

    System.out.println("\n=== DUPLICATES ===");
    files.findDuplicates();
  }

}
