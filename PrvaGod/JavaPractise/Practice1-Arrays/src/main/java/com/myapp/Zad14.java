package com.myapp;

import java.util.Arrays;

public class Zad14 {

  public static int[] MaxSubarray(int[] a) {
    int maxSoFar = a[0], maxEndingHere = a[0];
    int start = 0, end = 0, tempStart = 0;

    for (int i = 1; i < a.length; i++) {
      if (maxEndingHere + a[i] < a[i]) {
        maxEndingHere = a[i];
        tempStart = i;
      } else {
        maxEndingHere += a[i];
      }

      if (maxEndingHere > maxSoFar) {
        maxSoFar = maxEndingHere;
        start = tempStart;
        end = i;
      }
    }

    int[] result = Arrays.copyOfRange(a, start, end + 1);
    System.out.println(Arrays.toString(result));
    return result;
  }

}
