package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenOrPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] atgs) {
        int num = 6;
        System.out.println("Положительное " + isPositive(num));
        System.out.println("Отрицательное " + notPositive(num));
        System.out.println("Четное " + isEven(num));
        System.out.println("Нечетное " + notEven(num));
        System.out.println("Нечетное или отрицательное " + notEvenOrPositive(num));
        System.out.println("Четное или отрицательное " + evenOrNotPositive(num));
    }
}
