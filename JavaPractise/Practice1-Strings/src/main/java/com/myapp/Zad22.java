package com.myapp;

public class Zad22 {

  public static void Repetition(String s1, String s2) {
    int[] arr = new int[128];
    int max = 0;
    for (char c : s2.toCharArray())
      arr[c]++;

    for (char c : s1.toCharArray()) {
      if (arr[c] > max)
        max = arr[c];
    }
    System.out.println(max);
  }

}
