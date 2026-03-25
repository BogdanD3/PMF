package com.myapp;

public class Zad29 {

  private static boolean provjeri(String s) {

    if (s.indexOf('@') == -1 || s.indexOf('@') != s.lastIndexOf('@'))
      return false;

    String p = s.substring(0, s.indexOf('@'));
    String d = s.substring(s.indexOf('@') + 1);

    if (p.isEmpty() || d.isEmpty())
      return false;

    if (!Character.isLetterOrDigit(p.charAt(0)) ||
        !Character.isLetterOrDigit(p.charAt(p.length() - 1)))
      return false;

    if (p.contains("..") || d.contains("..") || !d.contains("."))
      return false;

    for (char c : p.toCharArray())
      if (!(Character.isLowerCase(c) || Character.isDigit(c)
          || c == '_' || c == '-' || c == '.'))
        return false;

    for (char c : d.toCharArray())
      if (!(Character.isLowerCase(c) || Character.isDigit(c) || c == '.'))
        return false;

    int n = d.length();
    return n >= 2 &&
        Character.isLetter(d.charAt(n - 1)) &&
        Character.isLetter(d.charAt(n - 2));
  }

  public static void ValidEmail(String s) {
    if (provjeri(s))
      System.out.println("Email je validan");
    else
      System.out.println("Email nije validan");
  }
}
