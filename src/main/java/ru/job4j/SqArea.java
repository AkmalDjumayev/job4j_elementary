package ru.job4j;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double i = h * k;
        double s = i * h;
        double rsl = s;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = square(6, 2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }
}
