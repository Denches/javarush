package com.javarush.tasts.level10.lesson11.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.
 *
 * Образец:
 * Я не хочу изучать Java, я хочу большую зарплату
 * не хочу изучать Java, я хочу большую зарплату
 * не хочу изучать Java, я хочу большую зарплату
 * е хочу изучать Java, я хочу большую зарплату
 * хочу изучать Java, я хочу большую зарплату
 * хочу изучать Java, я хочу большую зарплату
 */

public class Solution {

    public static void main(String[] args) {

        String str = "Я не хочу изучать Java, я хочу большую зарплату";

        String[] arr = str.split("");
        List<String> list = new ArrayList<>(Arrays.asList(arr));

        for (int i = 0; i < 40; i++) {

            for (String s : list){
                System.out.print(s);
            }

            System.out.println();

            list.remove(0);
        }


    }
}
