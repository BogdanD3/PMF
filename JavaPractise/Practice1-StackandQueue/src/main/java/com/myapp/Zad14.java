package com.myapp;

import java.util.*;

public class Zad14 {

  static PriorityQueue<Integer> pq = new PriorityQueue<>();
  static Scanner input = new Scanner(System.in);
  static List<Integer> svi = new ArrayList<>();

  public static void QK() {

    int n = 1;

    while (true) {
      System.out.println("Unesite broj: ");
      String k = input.next();

      if (k.equals("0"))
        return;

      // K
      if (k.equals("K")) {
        System.out.print("Unesite novo K: ");
        n = input.nextInt();

        rebuildHeap(n);
        continue;
      }

      // Q
      if (k.equals("Q")) {
        if (pq.size() < n) {
          System.out.println("Nema dovoljno cifara");
        } else {
          System.out.println(pq.peek());
        }
      }

      else {
        int num = Integer.parseInt(k);
        svi.add(num);

        if (pq.size() < n) {
          pq.add(num);
        } else if (num > pq.peek()) {
          pq.poll();
          pq.add(num);
        }
      }
    }
  }

  private static void rebuildHeap(int n) {
    pq.clear();

    for (int x : svi) {
      if (pq.size() < n) {
        pq.add(x);
      } else if (x > pq.peek()) {
        pq.poll();
        pq.add(x);
      }
    }
  }
}
