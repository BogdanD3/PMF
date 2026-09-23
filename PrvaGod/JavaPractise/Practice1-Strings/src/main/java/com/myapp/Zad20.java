package com.myapp;

public class Zad20 {

  public static void Anagrams(String s1, String s2) {
    if (s1.length() != s2.length()) {
      System.out.println("Nijesu anagrami!");
      return;
    }
    int arr[] = new int[128];
    int counter = s1.length();

    for (char c : s1.toCharArray()) {
      arr[c]++;
    }

    for (char c : s2.toCharArray()) {
      if (arr[c] == 0)
        break;
      arr[c]--;
      counter--;
    }

    if (counter == 0)
      System.out.println("Jesu anagrami!");
    else
      System.out.println("Nijesu anagrami!");
  }

}
