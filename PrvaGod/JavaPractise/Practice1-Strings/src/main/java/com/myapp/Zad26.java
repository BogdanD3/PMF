package com.myapp;

public class Zad26 {

    private static boolean valid(String s) {
        if (s.length() == 0 || s.length() > 3)
            return false;

        if (s.length() > 1 && s.charAt(0) == '0')
            return false;

        int num = Integer.parseInt(s);
        return num <= 255;
    }

    public static void CountIP(String s) {
        int n = s.length();
        int count = 0;

        for (int i = 1; i <= 3 && i < n; i++) {
            for (int j = i + 1; j <= i + 3 && j < n; j++) {
                for (int k = j + 1; k <= j + 3 && k < n; k++) {

                    String a = s.substring(0, i);
                    String b = s.substring(i, j);
                    String c = s.substring(j, k);
                    String d = s.substring(k);

                    if (valid(a) && valid(b) && valid(c) && valid(d)) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
