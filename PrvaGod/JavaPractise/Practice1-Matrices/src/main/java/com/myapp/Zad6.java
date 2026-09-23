package com.myapp;

import java.util.Arrays;

public class Zad6 {

  public static void Rotacija(int[][] matrix) {
    int n = matrix.length;

    for (int layer = 0; layer < n / 2; layer++) {
      int first = layer;
      int last = n - 1 - layer;

      for (int i = first; i < last; i++) {
        int offset = i - first;

        int temp = matrix[first][i];
        matrix[first][i] = matrix[last - offset][first];
        matrix[last - offset][first] = matrix[last][last - offset];
        matrix[last][last - offset] = matrix[i][last];
        matrix[i][last] = temp;
      }
    }
    for (int[] row : matrix) {
      System.out.println(Arrays.toString(row));
    }
  }
}
