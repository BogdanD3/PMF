package com.myapp;

public class Zad8 {

  public static float Polinom(float a[], float x) {
    float rez = a[0];
    float t = x;
    for (int i = 1; i < a.length; i++) {
      rez += x * a[i];
      x *= t;
    }
    return rez;
  }

}
