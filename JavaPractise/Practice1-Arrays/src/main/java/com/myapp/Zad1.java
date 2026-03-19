package com.myapp;

public class Zad1 {

  public static int maksimum(int a[]) {
    int max = a[0];
    for (int num : a) {
      if (max < num)
        max = num;
    }
    return max;
  }
}
