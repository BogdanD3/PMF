package com.myapp;

import java.util.ArrayList;

public class Zad19 {

  private static boolean duplikat(String niz[], String podstring, int br) {
    for (int i = 0; i < br; i++) {
      if (podstring.equals(niz[i]))
        return true;
    }
    return false;
  }

  public static void SubStrings(String str, int k) {
    String niz[] = new String[str.length() - k + 1];
    int br = 0;
    for (int i = 0; i <= str.length() - k; i++) {
      String podstring = str.substring(i, i + k);
      if (str.indexOf(podstring, i + 1) != -1) {
        if (duplikat(niz, podstring, br) == false) {
          niz[br] = podstring;
          br++;
        }
      }
    }

    for (int i = 0; i < br; i++) {
      System.out.println(niz[i]);
    }
  }
}
