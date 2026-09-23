package com.myapp;

public class Zad21 {

  public static void Lowers(String s1, String s2) {

    boolean[] A = new boolean[26];
    boolean[] B = new boolean[26];

    for (char c : s1.toCharArray())
      A[c - 'a'] = true;

    for (char c : s2.toCharArray())
      B[c - 'a'] = true;

    String union = "";
    String intersection = "";
    String sym_diff = "";

    for (int i = 0; i < 26; i++) {

      if (A[i] || B[i])
        union += (char) (i + 'a');

      if (A[i] && B[i])
        intersection += (char) (i + 'a');

      if (A[i] ^ B[i])
        sym_diff += (char) (i + 'a');
    }

    System.out.println("Union: " + union);
    System.out.println("Intersection: " + intersection);
    System.out.println("Symmetric difference: " + sym_diff);
  }
}
