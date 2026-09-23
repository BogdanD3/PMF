package com.myapp;

public class Zad13 {

  public static boolean Validna(int[][] a, int n) {
    for (int i = 0; i < n; i++) {
      boolean[] numsR = new boolean[n];
      boolean[] numsC = new boolean[n];

      for (int j = 0; j < n; j++) {
        if (a[i][j] < 1 || a[i][j] > n || numsR[a[i][j] - 1])
          return false;
        if (a[j][i] < 1 || a[j][i] > n || numsC[a[j][i] - 1])
          return false;

        numsR[a[i][j] - 1] = true;
        numsC[a[j][i] - 1] = true;
      }
    }
    return true;
  }

}
