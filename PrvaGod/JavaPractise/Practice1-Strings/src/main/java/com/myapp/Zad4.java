package com.myapp;

public class Zad4 {

  public static void NumberLetter(String s) {
    String result = "";

    for (char c : s.toCharArray()) {
      if (Character.isDigit(c)) {
        result += c;

        int broj = c - '0'; // konverzija u int

        if (broj % 2 == 0) {
          result += 'P';
        } else {
          result += 'N';
        }
      } else {
        result += c;
      }
    }
    System.out.println(result);
  }

}
