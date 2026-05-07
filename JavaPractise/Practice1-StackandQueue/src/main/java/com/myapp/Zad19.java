package com.myapp;

import java.util.*;

public class Zad19 {

  static class State {
    int a, b;
    String path;

    State(int a, int b, String path) {
      this.a = a;
      this.b = b;
      this.path = path;
    }
  }

  public static void voda(int A, int B, int C) {

    Queue<State> q = new LinkedList<>();
    Set<String> visited = new HashSet<>();

    q.add(new State(0, 0, ""));
    visited.add("0,0");

    while (!q.isEmpty()) {

      State cur = q.poll();

      int a = cur.a;
      int b = cur.b;

      if (a == C || b == C) {
        System.out.println(cur.path.length());
        System.out.println(cur.path);
        return;
      }

      add(q, visited, A, b, cur.path + "Fill A\n");

      add(q, visited, a, B, cur.path + "Fill B\n");

      add(q, visited, 0, b, cur.path + "Empty A\n");

      add(q, visited, a, 0, cur.path + "Empty B\n");

      int pourAB = Math.min(a, B - b);
      add(q, visited, a - pourAB, b + pourAB, cur.path + "A->B\n");

      int pourBA = Math.min(b, A - a);
      add(q, visited, a + pourBA, b - pourBA, cur.path + "B->A\n");
    }

    System.out.println(-1);
  }

  private static void add(Queue<State> q, Set<String> visited,
      int a, int b, String path) {

    String key = a + "," + b;

    if (!visited.contains(key)) {
      visited.add(key);
      q.add(new State(a, b, path));
    }
  }
}
