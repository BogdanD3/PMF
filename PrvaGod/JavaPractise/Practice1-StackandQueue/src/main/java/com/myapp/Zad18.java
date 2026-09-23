package com.myapp;

import java.util.HashSet;
import java.util.PriorityQueue;

public class Zad18 {

  static class Words {
    int amount;
    String word;

    public Words(int amount, String word) {
      this.amount = amount;
      this.word = word;
    }

  }

  public static void longestSubstrings(String s, int k, int n) {

    PriorityQueue<Words> pq = new PriorityQueue<>((a, b) -> a.amount - b.amount);

    HashSet<String> seen = new HashSet<>();

    int left = 0, right = n;
    int len = s.length();

    while (right <= len) {

      String word = s.substring(left, right);

      if (seen.contains(word)) {
        left++;
        right++;
        continue;
      }

      seen.add(word);

      int count = 0;

      for (int i = 0; i <= len - n; i++) {
        if (s.substring(i, i + n).equals(word)) {
          count++;
        }
      }

      Words w = new Words(count, word);

      if (pq.size() < k) {
        pq.add(w);
      } else if (pq.peek().amount < count) {
        pq.poll();
        pq.add(w);
      }

      left++;
      right++;
    }

    while (!pq.isEmpty()) {
      System.out.println(pq.poll().word);
    }
  }
}
