package com.myapp;

import java.util.Arrays;

public class Zad6 {

  public static void main(double a[], double b[], double x) {
    int c[] = new int[a.length];
    int m = 0;
    for (int i = 0; i < a.length; i++) {
      if (x > a[i] && x < b[i])
        c[m++] = i;
    }
    int[] c2 = Arrays.copyOf(c, m);
    System.out.println(Arrays.toString(c2));
  }

}
