package com.javarush.tasts.level8.lesson11.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 1. Ввести с клавиатуры число N.
 * 2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
 * 3. Найти минимальное число среди элементов списка - метод getMinimum.
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        List<Integer> list = getIntegerList();

        int min = getMinimum(list);

        System.out.println(min);

    }

    public static int getMinimum(List<Integer> list){

        int min = Integer.MAX_VALUE;

        for (Integer integer : list) {
            if (integer < min) {
                min = integer;
            }
        }

        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {

        List<Integer> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sNumber = reader.readLine();
        int number = Integer.parseInt(sNumber);

        for (int i = 0; i < number; i++) {

            sNumber = reader.readLine();
            int n = Integer.parseInt(sNumber);

            list.add(n);
        }

        return list;
    }

}
