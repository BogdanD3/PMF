package com.myapp;

public class Zad3 {

  public static void Vocals(String text) {
    String result = "";
    int l = 0;

    for (char c : text.toCharArray()) {
      if (Character.toLowerCase(c) == 'a' || Character.toLowerCase(c) == 'e' || Character.toLowerCase(c) == 'i' || Character.toLowerCase(c) == 'o' || Character.toLowerCase(c) == 'u') {
        if (l == 0) {
          l++;
          result += c;
        } else {
          result += '-';
          result += c;
        }
      } else {
        result += c;
        l = 0;
      }
    }
    System.out.println(result);
  }

}
