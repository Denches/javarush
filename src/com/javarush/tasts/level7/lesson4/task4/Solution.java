package com.javarush.tasts.level7.lesson4.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. Создать массив на 10 чисел.
 * 2. Ввести с клавиатуры 10 чисел и записать их в массив.
 * 3. Расположить элементы массива в обратном порядке.
 * 4. Вывести результат на экран, каждое значение выводить с новой строки.
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        int[] arr = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arr.length; i++) {

            String sNumber = reader.readLine();

            arr[i] = Integer.parseInt(sNumber);
        }

        for (int i = 0; i < arr.length; i++) {

            int k = arr.length - i - 1;

            if (i < k){
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }

        for (int s : arr){
            System.out.println(s);
        }
    }
}
