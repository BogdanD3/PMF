package com.myapp;

public class Zad6 {

  public static void VocalsThenOther(String s) {
    char[] arr = s.toCharArray();

    int left = 0;
    int right = 0;

    while (right < arr.length) {

      if (isVowel(arr[right])) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        left++;
      }
      right++;
    }

    System.out.println(String.valueOf(arr));
  }

  private static boolean isVowel(char c) {
    c = Character.toLowerCase(c);
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
  }

}
