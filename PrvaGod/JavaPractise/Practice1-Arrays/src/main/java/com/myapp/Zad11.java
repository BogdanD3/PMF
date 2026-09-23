package com.myapp;

import java.util.HashSet;

public class Zad11 {

  public static boolean imaDuplikate(int[] a) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : a) {
      if (set.contains(num)) {
        return true;
      }
      set.add(num);
    }
    return false;
  }

}
