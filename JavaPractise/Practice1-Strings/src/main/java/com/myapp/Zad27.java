package com.myapp;

public class Zad27 {

  public static void Replace(String s, String str1, String str2) {
    int len1 = str1.length();
    String rezultat = "";

    for (int i = 0; i < s.length();) {

      if (i + len1 <= s.length() && s.substring(i, i + len1).equals(str1)) {
        rezultat += str2;
        i += len1;
      } else {
        rezultat += s.charAt(i);
        i++;
      }
    }

    System.out.println(rezultat);
  }
}
