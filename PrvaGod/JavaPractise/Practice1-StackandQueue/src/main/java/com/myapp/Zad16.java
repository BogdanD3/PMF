package com.myapp;

import java.util.PriorityQueue;

public class Zad16 {

  public static void richest(int k, int m, int n, double[][] mat) {
    float[] values = new float[n];
    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Float.compare(values[a], values[b]));
    for (int i = 0; i < n; i++) {
      float temp = 0;
      for (int j = 0; j < m; j++) {
        temp += mat[j][i];
      }
      values[i] = temp;
      if (pq.isEmpty()) {
        pq.add(i);
        continue;
      }
      if (pq.size() < k) {
        pq.add(i);
      } else {
        if (values[pq.peek()] < temp) {
          pq.poll();
          pq.add(i);
        }
      }
    }
    while (!pq.isEmpty()) {
      System.out.println(pq.poll() + ", ");
    }
  }

}
