package com.myapp;

public class App {

  public static void main(String[] args) {

    Date d1 = new Date(1, 1, 2020);
    Date d2 = new Date(1, 1, 2022);
    Date d3 = new Date(1, 6, 2021);
    Date d4 = new Date(1, 1, 2023);

    Job j1 = new Job("FirmaA", d1, d2);
    Job j2 = new Job("FirmaB", d3, d4);

    Worker w1 = new Worker("1", "Marko", 5, 500.0f, new Job[] { j1 });
    Worker w2 = new Worker("2", "Jovan", 3, 400.0f, new Job[] { j2 });
    Worker w3 = new Worker("3", "Ana", 7, 700.0f, new Job[] { j1, j2 });

    Workers lista = new Workers();

    lista.addWorker(w1);
    lista.addWorker(w2);
    lista.addWorker(w3);

    System.out.println("=== SVI RADNICI ===");
    lista.listWorkers();

    System.out.println("\n=== NAKON BRISANJA (id=2) ===");
    lista.removeWorker("2");
    lista.listWorkers();

    Date testDate = new Date(1, 7, 2021);

    System.out.println("\n=== RADNICI KOJI SU RADILI NA DATUM 1.7.2021 ===");
    lista.didWork(testDate);
  }
}
