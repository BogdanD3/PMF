package com.myapp;

import java.util.Arrays;

public class Zad3 {

  public static void zamijeniKolone(int mat[][], int r, int s) {
    for (int i = 0; i < mat.length; i++) {
      int temp = mat[i][r];
      mat[i][r] = mat[i][s];
      mat[i][s] = temp;
    }

    for (int[] a : mat) {
      System.out.println(Arrays.toString(a));
    }
  }
}
