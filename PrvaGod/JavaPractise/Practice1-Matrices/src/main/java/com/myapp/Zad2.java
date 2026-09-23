package com.myapp;

public class Zad2 {

  public static void lokalniMaximum(int a[][]) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
     
        int bt = 0, br = 0, bb = 0, bl = 0, status = 0;

        if (i == 0) bt = 1;
        if (i == a.length - 1) bb = 1;
        if (j == 0) bl = 1;
        if (j == a[0].length - 1) br = 1;

        for (int m = i - 1 + bt; m <= i + 1 - bb; m++) {
          for (int n = j - 1 + bl; n <= j + 1 - br; n++) {
            if (a[m][n] == a[i][j]) continue;
            if (a[m][n] > a[i][j]) {
              status = 1;
              break;
            }
          }
        }
        if (status == 0) System.out.println("Lokalni maximum: (" + i + ", " + j + ")");
      }
    }
  }

}
