package com.myapp;

public class Zad10 {

  public static void RomanNumber(String s) {
    int result = 0;

    for (int i = 0; i < s.length(); i++) {

      int curr = vrijednost(s.charAt(i));

      if (i < s.length() - 1) {
        int next = vrijednost(s.charAt(i + 1));

        if (curr < next) {
          result -= curr;
        } else {
          result += curr;
        }
      } else {
        result += curr;
      }
    }

    System.out.println(result);
  }

  private static int vrijednost(char c) {
    switch (c) {
      case 'I':
        return 1;
      case 'V':
        return 5;
      case 'X':
        return 10;
      case 'L':
        return 50;
      case 'C':
        return 100;
      case 'D':
        return 500;
      case 'M':
        return 1000;
      default:
        return 0;
    }
  }

}
