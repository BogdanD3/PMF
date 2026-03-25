package com.myapp;

public class Zad28 {

public static void ReverseWords(String s) {
    String[] words = s.split(" ");
    StringBuilder result = new StringBuilder();

    for (String word : words) {
        StringBuilder reversed = new StringBuilder(word);
        result.append(reversed.reverse()).append(" ");
    }

    System.out.println(result.toString().trim());
}
}
