package com.myapp;

import java.util.*;

public class Zad15 {

  public static List<int[]> merge(int[][] inters) {

    List<int[]> intervals = new ArrayList<>();
    List<int[]> result = new ArrayList<>();

    for (int[] k : inters) {
      intervals.add(k);
    }

    if (intervals.isEmpty())
      return result;

    intervals.sort((a, b) -> a[0] - b[0]);

    int[] current = intervals.get(0);

    for (int i = 1; i < intervals.size(); i++) {
      int[] next = intervals.get(i);

      if (next[0] <= current[1]) {
        current[1] = Math.max(current[1], next[1]);
      } else {
        result.add(current);
        current = next;
      }
    }

    result.add(current);

    return result;
  }
}
