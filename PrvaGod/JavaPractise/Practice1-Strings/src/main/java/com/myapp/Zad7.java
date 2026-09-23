package com.myapp;

public class Zad7 {

  public static void ZigZag(String a, String b) {
    StringBuilder res = new StringBuilder();

    for (int i = 0; i < a.length(); i++) {
      res.append(a.charAt(i));
      res.append(b.charAt(i));
    }

    System.out.println(res);
  }

}
