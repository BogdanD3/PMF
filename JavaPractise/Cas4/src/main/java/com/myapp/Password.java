package com.myapp;

import java.util.Scanner;

public class Password {

  static Scanner unos = new Scanner(System.in);

  public static void main(String[] args) {

    String pass = unos.nextLine();
    char arr[] = pass.toCharArray();
    while (arr.length < 8) {
      System.out.println("Password must be longer than 8 chars: ");
      pass = unos.nextLine();
      arr = pass.toCharArray();
    }

    boolean up = false;
    boolean low = false;
    boolean num = false;
    boolean sp = false;

    for (char c : pass.toCharArray()) {
    if (Character.isLowerCase(c)) low = true;
    if (Character.isUpperCase(c)) up = true;
    if (Character.isDigit(c)) num = true;
    if ("$#@".indexOf(c) >= 0) sp = true;
}
    if (up && low && num && sp)
      System.out.println("Password is valid!");
    else
      System.out.println("Password is not valid!");
  }
// if (pass.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$#@]).{8,}"))
//     System.out.println("Valid");
// else
//     System.out.println("Not valid");
}
