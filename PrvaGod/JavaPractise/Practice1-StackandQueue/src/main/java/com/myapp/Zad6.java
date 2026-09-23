package com.myapp;

public class Zad6 {

  private static boolean checkDigits(int n) {
    if (n < 100) {
      int k = n / 10;
      if (Math.abs(n % 10 - k) == 1)
        return true;
      else
        return false;
    }

    String str = Integer.toString(n);
    int len = str.length();
    for (int i = 1; i < len - 1; i++) {
      if (Math.abs(str.charAt(i - 1) - str.charAt(i)) != 1 || Math.abs(str.charAt(i + 1) - str.charAt(i)) != 1)
        return false;
    }
    return true;
  }

  public static void segment(int m, int n) {
    for (int i = m; i <= n; i++) {
      if (i <= 10 || checkDigits(i))
        System.out.print(i + " ");
    }
    System.out.println();
  }

}
