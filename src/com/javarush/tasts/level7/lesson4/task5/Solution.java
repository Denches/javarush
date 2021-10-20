package com.javarush.tasts.level7.lesson4.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. Создать массив на 20 чисел.
 * 2. Ввести в него значения с клавиатуры.
 * 3. Создать два массива на 10 чисел каждый.
 * 4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
 * 5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        int[] arr = new int[20];
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arr.length; i++) {

            String sNumber = reader.readLine();

            arr[i] = Integer.parseInt(sNumber);

            if (i < 10) {
                arr1[i] = arr[i];
            }else {
                arr2[i - 10] = arr[i];
            }
        }

        for (int n : arr2){
            System.out.println(n);
        }
    }
}
