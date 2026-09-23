package com.myapp;

public class Zad23 {

  public static void Differences(String s1, String s2) {
    int[] abc1 = new int[26];
    String rez = "";

    for (char c : s1.toCharArray()) {
      abc1[c - 'a']++;
    }

    for (char c : s2.toCharArray()) {
      if (abc1[c - 'a'] > 0)
        abc1[c - 'a']--;
      else
        rez += c;
    }

    for (int i = 0; i < 26; i++) {
      if (abc1[i] > 0) {
        for (int j = 0; j < abc1[i]; j++) {
          rez += (char) (i + 'a');
        }
      }
    }

    System.out.println(rez);

  }

}
