package com.myapp;

public class Zad15 {

  public static void Caeser(String s, int k) {
    k = k % 26; 
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
      char c = (char) ((s.charAt(i) - 'a' + k) % 26 + 'a');
      result.append(c);
    }

    System.out.println(result);
  }

}
