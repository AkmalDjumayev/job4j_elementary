package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int sdacha = money - price;
        for (int i = 0; i < rsl.length; i++) {
            while (sdacha >= coins[0]  || sdacha >= coins[1] || sdacha >= coins[2] || sdacha >= coins[3]) {
                if (sdacha >= coins[0]) {
                    rsl[i] = coins[0];
                    sdacha -= coins[0];
                    size++;
                    i++;
                } else if  (sdacha >= coins[1]) {
                    rsl[i] = coins[1];
                    sdacha -= coins[1];
                    size++;
                    i++;
                } else if (sdacha >= coins[2]) {
                    rsl[i] = coins[2];
                    sdacha -= coins[2];
                    size++;
                    i++;
                } else if (sdacha >= coins[3]) {
                    rsl[i] = coins[3];
                    sdacha -= coins[3];
                    size++;
                    i++;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
