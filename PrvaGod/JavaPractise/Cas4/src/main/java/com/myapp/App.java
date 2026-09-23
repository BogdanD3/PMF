package com.myapp;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {

    String s = "I want to have a tomato";
    Caeser.main(s, 33);
    Roman.main(3888);
    /* Password.main(new String[0]); */
    System.out.println(Palindrome.isPalindrome("42224"));
    SubPalindrome.main("forgeeksskeegfor");

  }
}
