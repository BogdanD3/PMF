package com.myapp;

import java.util.*;

public class Zad17 {

  public static void weakest(int k, int[][] mat) {

    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {

      if (a[1] != b[1]) {
        return a[1] - b[1];
      }

      return a[0] - b[0];
    });

    for (int i = 0; i < mat.length; i++) {

      int soldiers = 0;

      for (int j = 0; j < mat[i].length; j++) {
        soldiers += mat[i][j];
      }

      pq.add(new int[] { i, soldiers });
    }

    for (int i = 0; i < k; i++) {

      if (!pq.isEmpty()) {
        System.out.println(pq.poll()[0]);
      }
    }
  }
}
