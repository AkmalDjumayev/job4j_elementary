package ru.job4j;

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
    }

        public static class Fit {
        public static double manWeight(short height) {
            double rsl = (height - 100) * 1.15;
            return rsl;
        }

        public static double womanWeight(short height) {
            double rsl = (height - 110) * 1.15;
            return rsl;
        }

        public static void main(String[] args) {
            short height = 187;
            double man = Fit.manWeight(height);
            System.out.println("Man 187 is " + man);
            height = 170;
            double woman = Fit.womanWeight(height);
            System.out.println("Woman 170 is " + woman);

            }
    }

    }

