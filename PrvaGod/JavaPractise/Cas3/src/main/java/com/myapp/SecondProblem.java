package com.myapp;

public class SecondProblem {

  public static void main(String[] args) {
    int[][] matrix = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}
    };

    int[][] mult = {
        {1, 0},
        {0, 1}
    };

    int[][] rez = new int[matrix.length - mult.length + 1][matrix[0].length - mult[0].length + 1];
    int k = mult.length;
    int rows = rez.length;
    int cols = rez[0].length;

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        int suma = 0;
        for (int m = 0; m < k; m++) {
          for (int n = 0; n < k; n++) {
            suma += matrix[i+m][j+n] * mult[m][n];
          }
        }
        rez[i][j] = suma;
      }
    }

    for (int i = 0; i < rez.length; i++) {
      for (int j = 0; j < rez[0].length; j++) {
        System.out.print(rez[i][j] + " ");
      }
      System.out.println();
    }
  }
}
