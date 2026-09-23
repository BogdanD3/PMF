package com.myapp;

import java.util.*;

public class Zad11 {

  static HashSet<Integer> visited = new HashSet<>();
  static Queue<String> q = new LinkedList<>();
  static Queue<Integer> rq = new LinkedList<>();

  public static void binNumber(int n) {

    q.add("1");
    rq.add(1 % n);
    visited.add(1 % n);

    while (!q.isEmpty()) {

      String k = q.poll();
      int remainder = rq.poll();

      if (remainder == 0) {
        System.out.println(k);
        return;
      }

      int r0 = (remainder * 10) % n;
      if (!visited.contains(r0)) {
        visited.add(r0);
        q.add(k + "0");
        rq.add(r0);
      }

      int r1 = (remainder * 10 + 1) % n;
      if (!visited.contains(r1)) {
        visited.add(r1);
        q.add(k + "1");
        rq.add(r1);
      }
    }
  }
}
