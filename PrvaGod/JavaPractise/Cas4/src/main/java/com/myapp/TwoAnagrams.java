package com.myapp;

import java.util.Arrays;

public class TwoAnagrams {

  static boolean anagram(String s1, String s2) {
    if (s1.length() != s2.length())
      return false;

    int[] arr1 = new int[26];
    int[] arr2 = new int[26];

    for (int i = 0; i < s1.length(); i++) {
      arr1[s1.charAt(i) - 'a']++;
      arr2[s2.charAt(i) - 'a']++;
    }

    return Arrays.equals(arr1, arr2);
  }

  public static void main(String[] args) {
  }
}
