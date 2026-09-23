package com.myapp;

public class FifthProblem {

  public static void main(String[] args) {
    String text = "aBCDeF3GIT";
    String result = "";
    int l = 0;

    for (char c : text.toCharArray()) {
      if (Character.isUpperCase(c)) {
        if (l == 0) {
          l++;
          result += c;
        } else {
          result += "_";
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
