package com.myapp;

public class Zad7 {

  public static boolean sortiran(int[] a) {
    boolean ascending = true;
    boolean descending = true;

    for (int i = 1; i < a.length; i++) {
      if (a[i] > a[i - 1])
        descending = false;
      if (a[i] < a[i - 1])
        ascending = false;
    }

    if (ascending) {
      if (a[0] == a[a.length - 1])
        System.out.println("All elements are same");
      else
        System.out.println("sorted normally");
      return true;
    } else if (descending) {
      System.out.println("reverse sorted");
      return true;
    } else {
      return false;
    }
  }
}
