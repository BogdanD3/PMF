package com.myapp;

public class Zad30 {

  public static void NextDay(String s) {

    s = s.replace('/', '.').replace('-', '.');

    int dan = Integer.parseInt(s.substring(0, 2));
    int mjesec = Integer.parseInt(s.substring(3, 5));
    int godina = Integer.parseInt(s.substring(6, 10));

    int maxDays = 0;

    switch (mjesec) {

      case 1: case 3: case 5: case 7:
      case 8: case 10: case 12:
        maxDays = 31;
        break;

      case 4: case 6: case 9: case 11:
        maxDays = 30;
        break;

      case 2:
        if ((godina % 4 == 0 && godina % 100 != 0) || (godina % 400 == 0))
          maxDays = 29;
        else
          maxDays = 28;
        break;

      default:
        System.out.println("Nevalidan datum");
        return;
    }

    dan++;

    if (dan > maxDays) {
      dan = 1;
      mjesec++;

      if (mjesec > 12) {
        mjesec = 1;
        godina++;
      }
    }

    String d = (dan < 10 ? "0" : "") + dan;
    String m = (mjesec < 10 ? "0" : "") + mjesec;

    System.out.println(d + "." + m + "." + godina);
  }
}
