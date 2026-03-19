package com.myapp;

public class Zad5 {

  public static boolean Toplicova(int[][] mat) {
    int n = mat.length;
    int m = mat[0].length;

    for (int k = 0; k < m; k++) {
      int val = mat[0][k];
      int i = 1, j = k + 1;
      while (i < n && j < m) {
        if (mat[i][j] != val)
          return false;
        i++;
        j++;
      }
    }

    for (int k = 1; k < n; k++) {
      int val = mat[k][0];
      int i = k + 1, j = 1;
      while (i < n && j < m) {
        if (mat[i][j] != val)
          return false;
        i++;
        j++;
      }
    }

    return true;
  }

}
  // public static int[][] popuniPoKontraDijagonalama(int n) {
  //   int[][] mat = new int[n][n];
  //
  //   for (int k = 0; k < n; k++) {
  //     int val = k + 1;
  //     int i = 0, j = k;
  //     while (i < n && j >= 0) {
  //       mat[i][j] = val;
  //       i++;
  //       j--;
  //     }
  //   }
  //
  //   for (int k = 1; k < n; k++) {
  //     int val = k + 1;
  //     int i = k, j = n - 1;
  //     while (i < n && j >= 0) {
  //       mat[i][j] = val;
  //       i++;
  //       j--;
  //     }
  //   }
  //
  //   return mat;
  // }
