package com.myapp;

public class Zad17 {

  public static void SubPalindrome(String s) {
    int max = 0, start = 0, end = 0;

    for (int i = 0; i < s.length(); i++) {
      int[] odd = expandAroundCenter(s, i, i);
      if (odd[0] > max) {
        max = odd[0];
        start = odd[1];
        end = odd[2];
      }

      if (i < s.length() - 1 && Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(i + 1))) {
        int[] even = expandAroundCenter(s, i, i + 1);
        if (even[0] > max) {
          max = even[0];
          start = even[1];
          end = even[2];
        }
      }
    }

    System.out.println(s.substring(start, end + 1));
  }

  private static int[] expandAroundCenter(String s, int left, int right) {
    while (left >= 0 && right < s.length() &&
        Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right))) {
      left--;
      right++;
    }
    int length = right - left - 1;
    return new int[] { length, left + 1, right - 1 };
  }
}
