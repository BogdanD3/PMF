package com.myapp;

public class App {

  public static void main(String[] args) {
    double[] x1 = { 0, 1, 1, 0 };
    double[] y1 = { 0, 0, 1, 1 };

    double[] x2 = { 0, 2, 2, 0 };
    double[] y2 = { 0, 0, 1, 1 };

    double[] x3 = { 0, 3, 3, 0 };
    double[] y3 = { 0, 0, 1, 1 };

    double[] x4 = { 0, 2, 3, 1 };
    double[] y4 = { 0, 0, 2, 2 };

    // Površina = 2, manji obim
    double[] x5 = { 0, 2, 2, 0 };
    double[] y5 = { 0, 0, 1, 1 };

    // Površina = 2, veći obim (duži i “tanji”)
    double[] x6 = { 0, 4, 4, 0 };
    double[] y6 = { 0, 0, 0.5, 0.5 };

    ListOfParalelograms list = new ListOfParalelograms();

    list.printList();
    list.add(new Paralelogram(x2, y2));
    list.add(new Paralelogram(x4, y4));
    list.add(new Paralelogram(x6, y6));
    list.add(new Paralelogram(x5, y5));
    list.add(new Paralelogram(x3, y3));
    list.add(new Paralelogram(x1, y1));
    list.printList();
    System.out.println();
    list.delete(3, 5);
    list.printList();
  }

}
