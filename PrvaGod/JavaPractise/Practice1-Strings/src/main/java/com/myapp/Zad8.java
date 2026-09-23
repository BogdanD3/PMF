package com.myapp;

public class Zad8 {
  
  public static void ValidPass(String s) {
    if (s.length() < 8) {
      System.out.println("Nije validna");
      return;
    }

    boolean imaVeliko = false;
    boolean imaMalo = false;
    boolean imaCifru = false;
    boolean imaSpecijalni = false;

    for (char c : s.toCharArray()) {

      if (Character.isUpperCase(c)) {
        imaVeliko = true;
      }

      if (Character.isLowerCase(c)) {
        imaMalo = true;
      }

      if (Character.isDigit(c)) {
        imaCifru = true;
      }

      if (c == '$' || c == '#' || c == '@') {
        imaSpecijalni = true;
      }
    }

    if (imaVeliko && imaMalo && imaCifru && imaSpecijalni) {
      System.out.println("Validna");
    } else {
      System.out.println("Nije validna");
    }
  }

}
