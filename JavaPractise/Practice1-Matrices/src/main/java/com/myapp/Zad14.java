package com.myapp;

import java.util.Arrays;

public class Zad14 {

  public static void Filter(int a[][], int k) {
    int rows = a.length;
    int cols = a[0].length;
    float res[][] = new float[rows - k + 1][cols - k + 1];
    float sum;

    for (int i = 0; i <= rows - k; i++) {
      for (int j = 0; j <= cols - k; j++) {
        sum = 0;
        for (int m = i; m < k + i; m++) {
          for (int n = j; n < k + j; n++) {
            sum += a[m][n];
          }
        }
        res[i][j] = sum / (k * k);
      }
    }

    for (float[] row : res) {
      System.out.println(Arrays.toString(row));
    }
  }

}
