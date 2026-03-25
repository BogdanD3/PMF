package com.myapp;

public class Zad25 {

  public static boolean ValidIP(String ip) {
    int parts = 0;
    int num = 0;
    int len = 0;

    for (int i = 0; i <= ip.length(); i++) {

      if (i == ip.length() || ip.charAt(i) == '.') {

        if (len == 0)
          return false;

        if (len > 1 && ip.charAt(i - len) == '0')
          return false;

        if (num > 255)
          return false;

        parts++;
        num = 0;
        len = 0;

      } else {
        char c = ip.charAt(i);

        if (!Character.isDigit(c))
          return false;

        num = num * 10 + (c - '0');
        len++;
      }
    }

    return parts == 4;
  }

}
