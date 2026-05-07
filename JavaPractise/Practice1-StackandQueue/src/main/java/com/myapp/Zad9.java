package com.myapp;

import java.util.*;

public class Zad9 {

  private String turnRight(String s, int i) {
    char[] arr = s.toCharArray();
    arr[i] = (char) ((arr[i] - '0' + 1) % 10 + '0');
    return new String(arr);
  }

  private String turnLeft(String s, int i) {
    char[] arr = s.toCharArray();
    arr[i] = (char) ((arr[i] - '0' + 9) % 10 + '0');
    return new String(arr);
  }

  public int solve(String start, String target, Set<String> forbidden) {

    if (forbidden.contains(start))
      return -1;

    Queue<String> q = new LinkedList<>();
    Set<String> visited = new HashSet<>();

    q.add(start);
    visited.add(start);

    int steps = 0;

    while (!q.isEmpty()) {
      int size = q.size();

      for (int k = 0; k < size; k++) {
        String curr = q.poll();

        if (curr.equals(target))
          return steps;

        for (int i = 0; i < 4; i++) {
          String right = turnRight(curr, i);
          String left = turnLeft(curr, i);

          if (!forbidden.contains(right) && !visited.contains(right)) {
            visited.add(right);
            q.add(right);
          }

          if (!forbidden.contains(left) && !visited.contains(left)) {
            visited.add(left);
            q.add(left);
          }
        }
      }
      steps++;
    }

    return -1;
  }
}
