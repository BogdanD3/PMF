package com.myapp;

public class Roman {

  public static void main(int k) {
    int romans[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    String letters[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
    String solution = "";
    int i = 0;

    while (k > 0) {
      while (k >= romans[i]) {
        solution += letters[i];
        k -= romans[i];
      }
      i++;
    }

    System.out.println(solution);
  }

}
