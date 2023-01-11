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

    public static class ArgMethod {
        public static void hello(String name, int age) {
            System.out.println("Hello, " + name + ", age = " + age);
        }

        public static void main(String[] args) {
            String name = "Job4j";
            int age = 6;
            ArgMethod.hello(name, age);
            ArgMethod.hello(name, age);
            ArgMethod.hello(name, age);
            ArgMethod.hello(name, age);
        } }
}
