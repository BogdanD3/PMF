package com.myapp;

import java.util.Arrays;

public class Zad8 {

  public static void PopuniMatricu2(int n) {
    int[][] mat = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        mat[i][j] = ((i + j) % n) + 1;
      }
    }

    for (int[] row : mat) {
      System.out.println(Arrays.toString(row));
    }
  }
}
