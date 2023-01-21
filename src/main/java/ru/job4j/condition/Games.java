package ru.job4j.condition;

public class Games {
    public static void permiission(boolean allowbyparent, boolean hasMoney) {
        if (allowbyparent && hasMoney) {
            System.out.println("I can go to the computer club");
        } else {
            System.out.println("I can't");
        }
    }

    public static void main(String[] args) {
        Games.permiission(true, true);
        Games.permiission(true, false);
        Games.permiission(false, true);
        Games.permiission(false, false);
    }
}
