package com.myapp;

public class Zad11 {

  private static int checkRow(int a[][], int m, int n) {
    for (int i = 0; i < a[0].length; i++) {
      if (i != n && a[m][i] == 1)
        return 1;
    }
    return 0;
  }

  private static int checkCol(int a[][], int m, int n) {
    for (int i = 0; i < a.length; i++) {
      if (i != m && a[i][n] == 1)
        return 1;
    }
    return 0;
  }

  public static void Servers(int a[][]) {
    int result = 0;

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        if (a[i][j] == 1) {
          if (checkRow(a, i, j) > 0 || checkCol(a, i, j) > 0) {
            result++;
          }
        }
      }
    }

    System.out.println(result);
  }
}
