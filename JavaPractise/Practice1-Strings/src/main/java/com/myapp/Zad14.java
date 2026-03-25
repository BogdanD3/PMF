package com.myapp;

public class Zad14 {

  public static void Backspace(String s1, String s2) {
    String r1 = "";
    String r2 = "";
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) == '#') {
        if (r1.length() > 0)
          r1 = r1.substring(0, r1.length() - 1);
      } else
        r1 += s1.charAt(i);
    }
    for (int i = 0; i < s2.length(); i++) {
      if (s2.charAt(i) == '#') {
        if (r2.length() > 0)
          r2 = r2.substring(0, r2.length() - 1);
      } else
        r2 += s2.charAt(i);
    }
    if (r1.equals(r2))
      System.out.println("DA");
    else
      System.out.println("NE");
  }

}
