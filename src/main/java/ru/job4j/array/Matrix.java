package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        array[0][0] = 1;
        int temp = 1;
        for (int row = 1; row < array.length; row++) {
            temp++;
            array[row][0] = temp;

        }
        temp = 1;
        for (int cell = 1; cell < array.length; cell++) {
            temp++;
            array[0][cell] = temp;
        }
        for (int row = 1; row < array.length; row++) {
            for (int cell = 1; cell < array.length; cell++) {
                array[row][cell] = array[0][cell] * array[row][0];
            }
        }
        return array;
    }
}
