package com.myapp;

public class Zad5 {

  public static void umetniCifru(String s) {
    String result = "";

    for (char c : s.toCharArray()) {
      if (Character.isDigit(c)) {
        result += c;

        int broj = c - '0';

        if (broj > 0) {
          result += (char) ((broj - 1) + '0');
        } else {
          result += '9';
        }
      } else {
        result += c;
      }
    }
    System.out.println(result);
  }

}
