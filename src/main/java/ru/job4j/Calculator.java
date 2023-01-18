package ru.job4j;

import static ru.job4j.math.MathFunction.*;

@SuppressWarnings("checkstyle:EmptyLineSeparator")
public class Calculator {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;
        int six = 6;
        int four = 4;
        int five = 5;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        int size = 10;
        size = 100;
        size = size - 5;

        System.out.println(onePlusTwo);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
        System.out.println("Сумма четырех " + allOfThem(5, 6));
    }

    public static double minusAndDivide(double first, double second) {
        return minus(first, second)
                + divide(first, second);
    }

    public static double allOfThem(double first, double second) {
        return minus(first, second)
                + divide(first, second)
                + sum(first, second)
                + multiply(first, second);
    }

}

