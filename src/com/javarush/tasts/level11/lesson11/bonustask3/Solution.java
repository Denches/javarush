package com.javarush.tasts.level11.lesson11.bonustask3;

/**
 * Написать метод, который возвращает минимальное и максимальное числа в массиве
 */

public class Solution {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        int[] arr2 = getMaxAndMin(arr);

        System.out.println(" max: " + arr2[0] + " min: " + arr2[1]);
    }

    public static int[] getMaxAndMin(int[] arr){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int j : arr) {

            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }

        return new int[]{max,min};
    }
}
