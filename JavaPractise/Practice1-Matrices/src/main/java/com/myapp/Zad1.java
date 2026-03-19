package com.myapp;

public class Zad1 {

    public static void SumaMatrice(int a[][]) {
        int sum = 0;
        for (int i = 0; i < a.length; i+=2) {
            for (int j = 1; j < a[i].length; j+=2) {
                sum += a[i][j];
            }
        }
        System.out.println("Suma matrice je: " + sum);
    }

}
