package com.javarush.tasts.level12.lesson12.bonustask3;

/**
 * Задача: Написать метод, который возвращает минимальное число в массиве и его позицию (индекс).
 */

public class Solution {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,-13,4,5,1};

        int[] ints = getMin(arr);

        System.out.println("Min number: " + ints[0] + " index: " + ints[1]);
    }

    static int[] getMin(int[] arr){

        int[] minArr = new int[2];
        minArr[0] = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minArr[0]){
                minArr[0] = arr[i];
                minArr[1] = i;
            }
        }
        return minArr;
    }
}
