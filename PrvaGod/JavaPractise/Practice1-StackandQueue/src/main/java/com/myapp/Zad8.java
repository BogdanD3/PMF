package com.myapp;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Zad8 {

  static Scanner input = new Scanner(System.in);
  public static void rating() {

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int count = 0;

    while (true) {
      System.out.println("Unesi ocjenu (0 za kraj): ");
      int x = input.nextInt();
      if (x == 0)
        break;

      count++;

      if (count < 3) {
        pq.add(x);
        System.out.println("Nema dovoljno ocjena");
        continue;
      }

      int k = count / 3;

      if (pq.size() < k) {
        pq.add(x);
      } else {
        if (x > pq.peek()) {
          pq.poll();
          pq.add(x);
        }
      }

      System.out.println("Najmanja u najboljoj trećini: " + pq.peek());
    }
  }
}
