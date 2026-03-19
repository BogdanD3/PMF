package com.myapp;

import java.util.Arrays;
public class Zad13 {

  public static void Premjesti(int a[]) {

    int left = 0, right = a.length - 1;

    while (left < right) {
      while (a[left] % 2 == 0 && left < right)
        left++;
      while (a[right] % 2 != 0 && left < right)
        right--;

      int temp = a[left];
      a[left] = a[right];
      a[right] = temp;
    }

    System.out.println(Arrays.toString(a));
  }
}
