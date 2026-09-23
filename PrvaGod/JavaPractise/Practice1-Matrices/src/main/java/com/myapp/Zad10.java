package com.myapp;

public class Zad10 {

  private static boolean checkRow(int a[][], int m, int n) {
    for (int i = 0; i < a[0].length; i++) {
      if (i == n)
        continue;
      if (a[m][i] > a[m][n])
        return false;
    }
    return true;
  }

  private static boolean checkCol(int a[][], int m, int n) {
    for (int i = 0; i < a.length; i++) {
      if (i == m)
        continue;
      if (a[i][n] > a[m][n])
        return false;
    }
    return true;
  }

  public static void StrongestRook(int a[][]) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        if (checkRow(a, i, j) && checkCol(a, i, j))
          System.out.println(a[i][j]);
      }
    }
  }

}
