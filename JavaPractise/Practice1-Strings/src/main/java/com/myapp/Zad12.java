package com.myapp;

public class Zad12 {

  public static int Absences(String s) {
    int oCounter = 0;
    int zCounter = 0;

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (c == 'O') {
        oCounter++;
        zCounter = 0;

        if (oCounter > 2)
          return 0;

      } else if (c == 'Z') {
        zCounter++;
        oCounter = 0;

        if (zCounter > 3)
          return 0;

      } else {
        oCounter = 0;
        zCounter = 0;
      }
    }

    return 1;
  }
}
