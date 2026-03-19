package com.myapp;

import java.util.Scanner;

public class Zad4 {

  static Scanner unos = new Scanner(System.in);

  public static int[] Duplikati() {
    int n = unos.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = unos.nextInt();
    }

    int m = 0;
    int rez[] = new int[n * 2];
    for (int num : arr) {
      rez[m++] = num;
      rez[m++] = num;
    }
    return rez;
  }

}
