package com.javarush.tasts.level7.lesson9.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
 * Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
 * Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
 * 2. Метод printList должен выводить на экран все элементы списка с новой строки.
 * 3. Используя метод printList, выведи эти три списка на экран.
 * Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> divBy3List = new ArrayList<>();
        List<Integer> divBy2List = new ArrayList<>();
        List<Integer> other = new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            String str = reader.readLine();
            Integer number = Integer.parseInt(str);

            if (number % 3 == 0 && number % 2 == 0){
                divBy3List.add(number);
                divBy2List.add(number);

            } else if (number % 3 == 0){
                divBy3List.add(number);
            } else if (number % 2 == 0){
                divBy2List.add(number);
            } else{
                other.add(number);
            }
        }

        printList(divBy3List);
        printList(divBy2List);
        printList(other);
    }

    public static void printList(List<Integer> list){

        list.forEach(System.out::println);
    }
}
