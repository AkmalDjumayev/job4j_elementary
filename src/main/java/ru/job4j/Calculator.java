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

    public static class MathFunc {
        public static int func1(int x) {
            int y = x * x + 1;
            return y;
        }

        public static int func2(int x) {
            int y = 1 / x;
            return y;
        }

         public static void main(String[] args) {
         int result1 = MathFunc.func1(3);
         int result2 = MathFunc.func2(5);
         int result3 = MathFunc.func1(100);
         int total = result1 + result2 + result3;
         System.out.println(total);
            }
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

