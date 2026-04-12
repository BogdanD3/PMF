package com.myapp;

public class App {

  public static void main(String[] args) {

    Drivers list = new Drivers();
    Driver hamilton = new Driver("Lewis Hamilton", "Mercedes");
    Driver verstappen = new Driver("Max Verstappen", "Red Bull");
    Driver leclerc = new Driver("Charles Leclerc", "Ferrari");
    Driver norris = new Driver("Lando Norris", "McLaren");
    Driver alonso = new Driver("Fernando Alonso", "Aston Martin");
    Driver sainz = new Driver("Carlos Sainz", "Ferrari");
    Driver russell = new Driver("George Russell", "Mercedes");

    for (int i = 0; i < 20; i++) {

      hamilton.scores[i] = 10;
      verstappen.scores[i] = 12;
      leclerc.scores[i] = 10;
      norris.scores[i] = 10;
      alonso.scores[i] = 15;
      sainz.scores[i] = 10;
      russell.scores[i] = 12;

      hamilton.ranks[i] = 1;
      verstappen.ranks[i] = 2;
      leclerc.ranks[i] = 1;
      norris.ranks[i] = 3;
      alonso.ranks[i] = 1;
      sainz.ranks[i] = 2;
      russell.ranks[i] = 1;
    }

    System.out.println("=== ADD DRIVERS ===");
    list.addDriver(hamilton);
    list.addDriver(verstappen);
    list.addDriver(leclerc);
    list.addDriver(norris);
    list.addDriver(alonso);
    list.addDriver(sainz);
    list.addDriver(russell);

    list.listDrivers();

    System.out.println("\n=== DELETE (HEAD TEST: Alonso) ===");
    list.delete("Fernando Alonso");
    list.listDrivers();

    System.out.println("\n=== DELETE (MIDDLE TEST: Leclerc) ===");
    list.delete("Charles Leclerc");
    list.listDrivers();

    System.out.println("\n=== DELETE (TAIL TEST: Verstappen) ===");
    list.delete("Max Verstappen");
    list.listDrivers();

    Driver piastri = new Driver("Oscar Piastri", "McLaren");
    for (int i = 0; i < 20; i++) {
      piastri.scores[i] = 12;
      piastri.ranks[i] = 1;
    }

    System.out.println("\n=== ADD Piastri (reinsert stress test) ===");
    list.addDriver(piastri);
    list.listDrivers();

    System.out.println("\n=== DELETE NON-EXISTENT DRIVER ===");
    list.delete("Non Existing");
    list.listDrivers();

    System.out.println("\n=== FINAL LIST STATE ===");
    list.listDrivers();
  }
}
