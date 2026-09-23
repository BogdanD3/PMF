package com.myapp;

import java.util.Arrays;

public class App {

  public static void main(String[] args) {

    int[] a1 = { 3, 5, 1, 9, -2 };
    System.out.println(Zad1.maksimum(a1));
    System.out.println("--------------------------------");

    int[] a2 = { 1, 2, 3, 4, 5 };
    System.out.println(Zad2.average(a2));
    System.out.println("--------------------------------");

    int[] a3 = { 2, 4, 5, 7, 8, 10 };
    System.out.println(Zad3.prebroj(a3, 5));
    System.out.println("--------------------------------");

    int[] a4 = { 1, 2, 3, 4, 2 };
    System.out.println(Arrays.toString(Zad4.Duplikati(a4)));
    System.out.println("--------------------------------");

    int[] a5 = { 1, 2, 3, 4, 5, 6 };
    Zad5.Razdvoj(a5);
    System.out.println("--------------------------------");

    double[] a6 = {1, 5, 10};
    double[] b6 = {4, 8, 15};
    Zad6.Intervali(a6, b6, 6);
    System.out.println("--------------------------------");

    int[] a7 = { 1, 2, 3, 4 };
    System.out.println(Zad7.sortiran(a7));
    System.out.println("--------------------------------");

    float[] a8 = { 2, 1, 5, 4 };
    System.out.println(Zad8.Polinom(a8, 2));
    System.out.println("--------------------------------");

    int[] a9 = { 0, -3, 5, -4, -2, 3, 1, 0 };
    Zad9.sums(a9);
    System.out.println("--------------------------------");

    int[] a10 = { 1, 2, 3, 4, 5, 6, 7 };
    Zad10.rotiraj(a10, 3);
    System.out.println(Arrays.toString(a10));
    System.out.println("--------------------------------");

    int[] a11 = { 1, 2, 3, 4, 2 };
    System.out.println(Zad11.imaDuplikate(a11));
    System.out.println("--------------------------------");

    int[] a12 = { 1, 3, 5 };
    Zad12.Forgotten(a12, 5);
    System.out.println("--------------------------------");

    int[] a13 = { 2, 14, 25, 31, 26, 29, 47, 35 };
    Zad13.Premjesti(a13);
    System.out.println(Arrays.toString(a13));
    System.out.println("--------------------------------");

    int[] a14 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    Zad14.MaxSubarray(a14);
    System.out.println("--------------------------------");

    int[] a15 = { 1, 3, 5, 7, 0 };
    Zad15.ubaci(a15, 4);
    System.out.println(Arrays.toString(a15));
    System.out.println("--------------------------------");
  }
}
