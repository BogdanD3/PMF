package com.myapp;

public class Caeser {

  public static void main(String s, int k) {

    k %= 26;

    char[] str = s.toCharArray();

    for (int i = 0; i < str.length; i++) {

      if (str[i] != ' ') {
        if (str[i] + k <= 'z')
          str[i] = (char) (str[i] + k);
        else
          str[i] = (char) ('a' + (str[i] + k - 'z' - 1));
      }

    }

    System.out.println(new String(str));
  }
}
