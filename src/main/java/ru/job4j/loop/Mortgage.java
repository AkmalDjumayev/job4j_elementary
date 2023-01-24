package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double balance = amount;
        while (balance > 0) {
            balance = balance + (percent * balance / 100) - salary;
            year++;
        }
        return year;
    }
}
