package com.myapp;

public class FourthProblem {

  public static void main(String[] args) {
    String str = "0aleksandarradnaskela1";    
    String reversedStr = "";

    for (int i = str.length() - 1; i >= 0; i--) {
      reversedStr += str.charAt(i);
    }
    System.out.println(reversedStr);
  }
}
