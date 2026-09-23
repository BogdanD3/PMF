package com.myapp;
import java.util.Arrays;

public class Zad5 {

  public static void Razdvoj (int a[]) {

    int b[] = new int[a.length];
    int c[] = new int[a.length];
    int n = 0, m = 0;

    for (int num : a) {
      if (num % 2 == 0)
        b[n++] = num;
      else
        c[m++] = num;
    }
    
    int[] b2 = Arrays.copyOf(b, n);
    int[] c2 = Arrays.copyOf(c, m);
    System.out.println(Arrays.toString(b2));
    System.out.println(Arrays.toString(c2));

  }

}
