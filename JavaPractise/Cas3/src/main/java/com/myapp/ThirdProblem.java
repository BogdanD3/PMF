package com.myapp;

public class ThirdProblem {

  public static void main(String[] args) {
    String text = "hello world";

    String vowels = "";

    for (char c : text.toCharArray()) {
      if ("aeiouAEIOU".indexOf(c) != -1) {
        vowels += c;
      } else if (Character.isLetter(c)) {
        System.out.println(c);
      }
    }

    System.out.println("Vowels: " + vowels);
  }

}
