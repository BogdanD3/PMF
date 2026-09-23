package com.myapp;

import java.util.Scanner;

public class Zad4 {

  static Scanner unos = new Scanner(System.in);

  public static int[] Duplikati(int arr[]) {
    // int n = unos.nextInt();
    // int arr[] = new int[n];
    //
    // for (int i = 0; i < n; i++) {
    //   arr[i] = unos.nextInt();
    // }
    // u zadatku kao treba da se upise al mi muka kad testiram

    int m = 0;
    int rez[] = new int[arr.length * 2];
    for (int num : arr) {
      rez[m++] = num;
      rez[m++] = num;
    }
    return rez;
  }

}
