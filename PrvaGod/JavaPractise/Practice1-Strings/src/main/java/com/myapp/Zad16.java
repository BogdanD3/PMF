package com.myapp;

public class Zad16 {

  public static void Encryption(String s, String key) {
    int k = 0;
    String result = "";
    int keylen = key.length();
    while (k + keylen < s.length()) {
      int m = k % key.length();
      key += key.charAt(m);
      k++;
    }
    for (int i = 0; i < s.length(); i++) {
      result += (char) ((s.charAt(i) - 'a' + key.charAt(i) - 'a') % 26 + 'a');
    }
    System.out.println(result);
    System.out.println(Decryption(result, key));
  }

  public static String Decryption(String s, String key) {
    String decrypted = "";
    for (int i = 0; i < s.length(); i++) {
      decrypted += (char) ((s.charAt(i) - 'a' - (key.charAt(i) - 'a') + 26) % 26 + 'a');
    }
    return decrypted;
  }

}
