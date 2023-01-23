package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (3 * ivan < 2 * nik) {
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }
}
