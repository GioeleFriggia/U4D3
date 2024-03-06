package es1;

public class Esercizio1 {
    public static boolean isBisestile(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
