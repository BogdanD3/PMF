package com.myapp;

public class Zad18 {

  public static void Subs(String s, int k) {

    int[] count = new int[4];

    for (int i = 0; i < k; i++) {
      add(count, s.charAt(i));
    }

    if (allPresent(count))
      System.out.println(s.substring(0, k));

    for (int i = k; i < s.length(); i++) {

      add(count, s.charAt(i));

      remove(count, s.charAt(i - k));

      if (allPresent(count))
        System.out.println(s.substring(i - k + 1, i + 1));
    }
  }

  private static void add(int[] count, char c) {
    if (c == 'A')
      count[0]++;
    if (c == 'C')
      count[1]++;
    if (c == 'G')
      count[2]++;
    if (c == 'T')
      count[3]++;
  }

  private static void remove(int[] count, char c) {
    if (c == 'A')
      count[0]--;
    if (c == 'C')
      count[1]--;
    if (c == 'G')
      count[2]--;
    if (c == 'T')
      count[3]--;
  }

  private static boolean allPresent(int[] count) {
    return count[0] > 0 && count[1] > 0 &&
        count[2] > 0 && count[3] > 0;
  }
}
