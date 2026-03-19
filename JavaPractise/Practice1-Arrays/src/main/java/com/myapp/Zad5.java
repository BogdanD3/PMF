package com.myapp;
import java.util.Arrays;

public class Zad5 {

  public static void main (int a[]) {

    int b[] = new int[a.length];
    int c[] = new int[a.length];
    int n = 0, m = 0;

    for (int num : a) {
      if (num % 2 == 0)
        b[n++] = num;
      else
        c[m++] = num;
    }

    System.out.println(Arrays.toString(b));
    System.out.println(Arrays.toString(c));

  }

}
