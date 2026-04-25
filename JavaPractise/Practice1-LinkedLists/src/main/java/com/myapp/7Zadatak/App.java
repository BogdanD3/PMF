package com.myapp;

public class App {

  public static void main(String[] args) {

    Bills bills = new Bills();

    // Dodavanje računa
    bills.addBill("Marko", "CKB", 1250.00f);
    bills.addBill("Marko", "NLB", 800.00f);
    bills.addBill("Ana", "CKB", 1500.00f);
    bills.addBill("Ana", "Hipotekarna", 500.00f);
    bills.addBill("Petar", "NLB", 900.00f);
    bills.addBill("Petar", "CKB", 700.00f);
    bills.addBill("Jelena", "CKB", 2000.00f);

    System.out.println("=== LISTA RACUNA ===");
    bills.listBills();

    System.out.println("\n=== PRETRAGA (Marko + NLB) ===");
    bills.findBills("Marko", "NLB");

    System.out.println("\n=== VLASNICI SA VISE BANAKA ===");
    bills.pronadjiVlasnike();
  }
}
