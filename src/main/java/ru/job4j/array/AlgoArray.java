package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        int temp1 = array[3];
        int temp2 = array[2];
        int temp3 = array[1];
        int temp4 = array[4];
        int temp5 = array[0];
        array[0] = temp1;
        array[1] = temp2;
        array[2] = temp3;
        array[3] = temp4;
        array[4] = temp5;
        for (int number : array) {
            System.out.println(number);
        }
    }
}
