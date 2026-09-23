package com.myapp;

public class Zad16 {
  public static void printZigZag(int[][] mat) {
    int n = mat.length;

    for (int d = 0; d <= 2 * (n - 1); d++) {

      if (d % 2 != 0) {
        for (int i = 0; i < n; i++) {
          int j = d - i;
          if (j >= 0 && j < n) {
            System.out.print(mat[i][j] + " ");
          }
        }
      } else {
        for (int i = n - 1; i >= 0; i--) {
          int j = d - i;
          if (j >= 0 && j < n) {
            System.out.print(mat[i][j] + " ");
          }
        }
      }
    }
  }

}
