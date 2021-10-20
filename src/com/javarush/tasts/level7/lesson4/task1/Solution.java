package com.javarush.tasts.level7.lesson4.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. В методе initializeArray():
 * 1.1. Создайте массив на 20 чисел
 * 1.2. Считайте с консоли 20 чисел и заполните ими массив
 * 2. Метод max(int[] array) должен находить максимальное число из элементов массива
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        int[] arr = initializeArray();

        int max = max(arr);

        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {

        int[] arr = new int[20];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arr.length; i++) {

            String sNumber = reader.readLine();

            arr[i] = Integer.parseInt(sNumber);
        }

        return arr;
    }

    public static int max(int[] array){

        int max = Integer.MIN_VALUE;

        for (int n : array) {

            if (n > max)
                max = n;
        }
        return max;
    }
}
