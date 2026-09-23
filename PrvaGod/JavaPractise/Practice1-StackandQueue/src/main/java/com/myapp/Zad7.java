package com.myapp;

import java.util.PriorityQueue;

public class Zad7 {

  public static int minCost(int[] ropes) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    for (int r : ropes) {
      pq.add(r);
    }

    int total = 0;

    while (pq.size() > 1) {
      int a = pq.poll();
      int b = pq.poll();

      int sum = a + b;
      total += sum;

      pq.add(sum);
    }

    return total;
  }
}
