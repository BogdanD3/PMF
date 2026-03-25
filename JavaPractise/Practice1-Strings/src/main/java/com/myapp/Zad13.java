package com.myapp;

public class Zad13 {

  public static boolean CheckString(String s) {
    int i = 0;
    int n = s.length();

    int countA = 0;
    int countC = 0;

    while (i < n && s.charAt(i) == 'a') {
      countA++;
      i++;
    }

    if (countA == 0 || countA % 2 != 0)
      return false;

    while (i < n && s.charAt(i) == 'b') {
      i++;
    }

    while (i < n && s.charAt(i) == 'c') {
      countC++;
      i++;
    }

    if (countA != countC)
      return false;

    return i == n;
  }

}
