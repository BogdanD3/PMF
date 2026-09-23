package com.myapp;

public class Zad7 {

  public static int[][] popuniMatricu1(int m, int n, int k) {
    int[][] matrica = new int[m][n];

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        matrica[i][j] = -k + (int) (Math.random() * (2 * k + 1));
      }
    }

    return matrica;
  }

}
