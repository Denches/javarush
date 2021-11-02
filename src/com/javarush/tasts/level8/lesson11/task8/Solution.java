package com.javarush.tasts.level8.lesson11.task8;

import java.util.Arrays;

/**
 * Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
 */

public class Solution {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,76,8,6456,5,3,2,5,7,4456,658,457,345,234,234,123};

        Arrays.sort(arr);

        for (int i = 0; i < 5; i++) {
            System.out.println(arr[arr.length - 1 - i]);
        }

    }
}
