package com.myapp;

public class Zad12 {

  public static void Forgotten(int a[], int n) {
    int comp[] = new int[n];

    for (int num : a) {
      comp[num - 1] = 1;
    }

    for (int i = 1; i < n + 1; i++) {
      if (comp[i - 1] == 0) System.out.println(i);
    }
  }

}
