package com.myapp;

public class Zad15 {

  public static void ubaci(int a[], int r) {
    int index = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == r || a[i] > r) {
        index = i;
        break;
      }
    }

    for (int i = a.length - 1; i > index; i--) {
      a[i] = a[i - 1];
    }
    a[index] = r;
  }

}
