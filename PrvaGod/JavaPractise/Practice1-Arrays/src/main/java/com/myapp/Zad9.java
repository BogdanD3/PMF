package com.myapp;

public class Zad9 {

  public static void sums(int a[]) {
    int Lsum = 0;
    int Rsum = 0;
    int c = 0;

    for (int num : a) {
      Rsum += num;
    }

    for (int i = 0; i < a.length; i++) {
      Rsum -= a[i];
      if (Lsum == Rsum) {
        c++;
        System.out.println(i);
      }
      Lsum += a[i];
    }
    if (c == 0) System.out.println(-1);
  }

}
