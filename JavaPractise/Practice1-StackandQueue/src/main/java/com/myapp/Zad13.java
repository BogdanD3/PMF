package com.myapp;

import java.util.PriorityQueue;

public class Zad13 {

  public static void minSum(int[] nums) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int num1 = 0, num2 = 0;

    for (int k : nums) {
      pq.add(k);
    }

    while (!pq.isEmpty()) {
      num1 = num1 * 10 + pq.poll();
      num2 = num2 * 10 + pq.poll();
    }
    if (!pq.isEmpty())
      System.out.println(num2 + num1);

  }

}
