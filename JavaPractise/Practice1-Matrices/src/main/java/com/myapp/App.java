package com.myapp;

public class App {
  public static void main(String[] args) {

    int[][] mat1 = {
        { 3, 7, 2, 5 },
        { 9, 4, 6, 1 },
        { 8, 10, 11, 0 },
        { 2, 6, 3, 19 }
    };
    int[][] mat2 = {
        { 1, 3, 2, 4, 6 },
        { 5, 9, 7, 8, 2 },
        { 4, 6, 12, 3, 1 },
        { 7, 2, 5, 10, 0 }
    };

    int[][] mat3 = {
        { 1, 2, 3, 4 },
        { 2, 5, 6, 7 },
        { 3, 6, 8, 9 },
        { 4, 7, 9, 10 }
    };

    int[][] mat4 = {
        { 1, 2, 3, 4, 5, 6 },
        { 7, 1, 2, 3, 4, 5 },
        { 8, 7, 1, 2, 3, 4 },
        { 9, 8, 7, 1, 2, 3 },
        { 10, 9, 8, 7, 1, 2 },
        { 11, 10, 9, 8, 7, 1 }
    };

    int[][] mat5 = {
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 }
    };

    int[][] mat6 = {
        { 1, 0, 0, 1 },
        { 0, 0, 1, 0 },
        { 0, 0, 0, 0 },
        { 1, 0, 0, 0 }
    };

    int[][] mat7 = {
        { 1, 2, 3, 4 },
        { 2, 3, 4, 1 },
        { 3, 4, 1, 2 },
        { 4, 1, 2, 3 }
    };

    int[][] mat8 = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    int[][] mat9 = {
        { 1, 2, 3, 4, 5 },
        { 6, 7, 8, 9, 10 },
        { 11, 12, 13, 14, 15 },
        { 16, 17, 18, 19, 20 },
        { 21, 22, 23, 24, 25 } };

    float[][] mat10 = {
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 }
    };

    Zad1.SumaMatrice(mat3);
    System.out.println("-----------------------------");
    Zad2.lokalniMaximum(mat2);
    System.out.println("-----------------------------");
    Zad3.zamijeniKolone(mat1, 0, 3);
    System.out.println("-----------------------------");
    if (Zad4.Simetricna(mat3))
      System.out.println("Matrica je simetricna!");
    else
      System.out.println("Matrica nije simetricna!");
    System.out.println("-----------------------------");
    if (Zad5.Toplicova(mat4))
      System.out.println("Matrica je Toplicova!");
    else
      System.out.println("Matrica nije Toplicova!");
    System.out.println("-----------------------------");
    Zad6.Rotacija(mat4);
    System.out.println("-----------------------------");
    Zad8.PopuniMatricu2(5);
    System.out.println("-----------------------------");
    Zad9.fillSpiral(4, 5);
    System.out.println("-----------------------------");
    Zad10.StrongestRook(mat5);
    System.out.println("-----------------------------");
    Zad11.Servers(mat6);
    System.out.println("-----------------------------");
    Zad12.Servers(mat6);
    System.out.println("-----------------------------");
    if (Zad13.Validna(mat7, 4))
      System.out.println("Matrica je validna!");
    else
      System.out.println("Matrica nije validna!");
    System.out.println("-----------------------------");
    Zad14.Filter(mat2, 3);
    System.out.println("-----------------------------");
    Zad15.Pomnozi(mat1, mat3);
    System.out.println("-----------------------------");
    Zad16.printZigZag(mat5);
    System.out.println("-----------------------------");
    Zad17.Zgrade(mat10, 1000);
    System.out.println("-----------------------------");
  }
}
