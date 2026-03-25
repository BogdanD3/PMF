package com.myapp;

public class Zad31 {

    private static int maxDays(int m, int g) {
        if (m == 2)
            return ((g % 4 == 0 && g % 100 != 0) || g % 400 == 0) ? 29 : 28;
        return (m == 4 || m == 6 || m == 9 || m == 11) ? 30 : 31;
    }

    private static int mjesecIzStringa(String m) {
        switch (m.toLowerCase()) {
            case "januar": case "jan": return 1;
            case "februar": case "feb": return 2;
            case "mart": case "mar": return 3;
            case "april": case "apr": return 4;
            case "maj": return 5;
            case "jun": return 6;
            case "jul": return 7;
            case "avgust": case "avg": return 8;
            case "septembar": case "sep": return 9;
            case "oktobar": case "okt": return 10;
            case "novembar": case "nov": return 11;
            case "decembar": case "dec": return 12;
            default: return -1;
        }
    }

    public static void ValidDate(String s) {

        s = s.replace('/', '.').replace('-', '.');

        boolean valid;

        if (s.contains(".")) {
            String[] p = s.split("\\.");
            if (p.length != 3) valid = false;
            else {
                int d = Integer.parseInt(p[0]);
                int m = Integer.parseInt(p[1]);
                int g = Integer.parseInt(p[2]);

                valid = m >= 1 && m <= 12 &&
                        g >= 1000 && g <= 9999 &&
                        d >= 1 && d <= maxDays(m, g);
            }
        } else {
            String[] p = s.split(" ");
            if (p.length != 3 || !p[0].endsWith(".")) valid = false;
            else {
                int d = Integer.parseInt(p[0].replace(".", ""));
                int m = mjesecIzStringa(p[1]);
                int g = Integer.parseInt(p[2]);

                valid = m != -1 &&
                        g >= 1000 && g <= 9999 &&
                        d >= 1 && d <= maxDays(m, g);
            }
        }

        System.out.println(valid ? "Datum je validan" : "Datum nije validan");
    }
}
