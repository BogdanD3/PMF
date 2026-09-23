package com.myapp;

public class Zad9 {

  public static void BinarySum(String a, String b) {
    String result = "";

    int i = a.length() - 1;
    int j = b.length() - 1;
    int carry = 0;

    while (i >= 0 || j >= 0 || carry > 0) {

      int suma = carry;

      if (i >= 0) {
        suma += a.charAt(i) - '0';
        i--;
      }

      if (j >= 0) {
        suma += b.charAt(j) - '0';
        j--;
      }

      result = (suma % 2) + result;
      carry = suma / 2;
    }

    System.out.println(result);
  }

}
