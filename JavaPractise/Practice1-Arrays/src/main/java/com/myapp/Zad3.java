package com.myapp;

public class Zad3 {

  public static int prebroj(int a[], int k) {
    int res = 0;
    for (int num : a) {
      if (num % 2 == 0 && num > k)
        res++;
    }
    return res;
  }

}
