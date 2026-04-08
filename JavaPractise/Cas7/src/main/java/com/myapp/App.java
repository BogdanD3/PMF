package com.myapp;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {
    // Node c7 = new Node("Bogdan", "CKB", -2.5f);
    // Node c6 = new Node("Milivoje", "Addiko", 2.2f);
    // Node c5 = new Node("Bojke", "Prva Crnogoska", 100);
    // Node c4 = new Node("Drunked", "Erste", 345);
    // Node c3 = new Node("Anto", "Neka Ulcinjska", 1000);
    // Node c2 = new Node("Nevena", "Lovcen", 3257);
    // Node c1 = new Node("Djuri", "NLB", 10456);
    //
    // c1.next = c2;
    // c2.next = c3;
    // c3.next = c4;
    // c4.next = c5;
    // c5.next = c6;
    // c6.next = c7;
    //
    // Bills bill = new Bills();
    // bill.head = c1;
    //
    // bill.printBills();
    // System.out.println("");
    // bill.addBill("Petar", "NLB", -500);
    // bill.addBill("Milos", "Lovc", 100000);
    // bill.addBill("Petar", "Lovcen", 100000);
    // bill.addBill("Djuri", "NLB", 100000);
    // bill.printBills();
    // System.out.println("");
    // bill.findBills("Anto", "a");
    // System.out.println("");
    // bill.findHolders();
    // System.out.println("");

    // // Kreiranje korisnika
    // User marko = new User("Marko");
    // User jovana = new User("Jovana");
    // User petar = new User("Petar");
    // User ana = new User("Ana");
    //
    // // Dodavanje postova
    // marko.addPost("Marko post 1");
    // marko.addPost("Marko post 2");
    //
    // jovana.addPost("Jovana post 1");
    //
    // // Follow odnosi
    // jovana.Follow(marko); // Jovana prati Marka
    // petar.Follow(marko); // Petar prati Marka
    // ana.Follow(marko); // Ana prati Marka
    //
    // marko.Follow(jovana); // Marko prati Jovanu (mutual)
    //
    // petar.Follow(jovana); // Petar prati Jovanu
    // // TEST 1: Pratioci Marka
    // System.out.println("Followers of Marko:");
    // marko.showFollowers();
    // System.out.println("\nPosts of Marko:");
    // marko.showPosts();
    // System.out.println("\nDoes Jovana follow Marko?");
    // marko.DoesHeFollowMe(marko, jovana);
    // System.out.println("Does Ana follow Jovana?");
    // jovana.DoesHeFollowMe(jovana, ana);
    // System.out.println("\nFans of Marko:");
    // marko.FindFans();

    Files fajlovi = new Files();

    fajlovi.addFile("banana.txt", "yellow fruit");
    fajlovi.addFile("apple.txt", "red fruit");
    fajlovi.addFile("cherry.txt", "small red fruit");
    fajlovi.addFile("mango.txt", "tropical fruit");
    fajlovi.addFile("avocado.txt", "green fruit");
    fajlovi.addFile("d1.txt", "green fruit");
    fajlovi.addFile("d2.txt", "tropical fruit");
    fajlovi.addFile("d3.txt", "yellow fruit");

    fajlovi.printFiles();
    System.out.println("");
    fajlovi.findFile("n");
    System.out.println("");
    fajlovi.findDupes();
  }
}
