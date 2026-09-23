package com.myapp;

import java.util.Arrays;

public class Zad17 {

  public static void Zgrade(float a[][], int lift) {
    int people = 0;
    for (int i = 0; i < a.length; i++) {
      int floor = i + 1;
      for (int j = 0; j < a[0].length; j++) {
        people += a[i][j] * floor;
      }
    }
    float price = (float) lift / people;

    for (int i = 0; i < a.length; i++) {
      int floor = i + 1;
      for (int j = 0; j < a[0].length; j++) {
        a[i][j] = a[i][j] * price * floor;
      }
    }
    for (float[] row : a) {
      System.out.println(Arrays.toString(row));
    }
  }

}
