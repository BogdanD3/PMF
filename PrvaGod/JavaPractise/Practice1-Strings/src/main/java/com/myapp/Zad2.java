package com.myapp;

public class Zad2 {

  public static void AddLowerLetters(String text) {
    String result = "";

    for (char c : text.toCharArray()) {
      if (Character.isUpperCase(c)) {
        result += c;
        result += Character.toLowerCase(c);
      } else {
        result += c;
      }
    }
    System.out.println(result);
  }

}
