package com.myapp;

public class SixthProblem {

  public static void main(String s) {
    String result = "";
    for (char c : s.toCharArray()) {
      if (Character.isUpperCase(c)) {
        result += c;
        result += Character.toLowerCase(c);
      } else {
        result += c;
      }
    } 
    System.out.println(result);
  }

}
