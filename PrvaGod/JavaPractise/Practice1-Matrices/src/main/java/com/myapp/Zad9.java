package com.myapp;

import java.util.Arrays;

public class Zad9 {

  public static int[][] fillSpiral(int m, int n) {
    int[][] matrix = new int[m][n];
    int num = 1;

    int top = 0;
    int bottom = m - 1;
    int left = 0;
    int right = n - 1;

    while (top <= bottom && left <= right) {
      for (int j = left; j <= right; j++) {
        matrix[top][j] = num++;
      }
      top++;

      for (int i = top; i <= bottom; i++) {
        matrix[i][right] = num++;
      }
      right--;

      if (top <= bottom) {
        for (int j = right; j >= left; j--) {
          matrix[bottom][j] = num++;
        }
        bottom--;
      }

      if (left <= right) {
        for (int i = bottom; i >= top; i--) {
          matrix[i][left] = num++;
        }
        left++;
      }
    }

    for (int[] row : matrix) {
      System.out.println(Arrays.toString(row));
    }
    return matrix;
  }

}
