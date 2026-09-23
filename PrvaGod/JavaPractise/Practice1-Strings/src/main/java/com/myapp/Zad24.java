package com.myapp;

public class Zad24 {

  public static void MakeString(String A, String B) {
    int[] count = new int[128];

    for (char c : B.toCharArray()) {
      count[c]++;
    }

    for (char c : A.toCharArray()) {
      if (count[c] > 0)
        count[c]--;
      else {
        System.out.println("NE");
        return;
      }
    }

    System.out.println("DA");
  }
}
