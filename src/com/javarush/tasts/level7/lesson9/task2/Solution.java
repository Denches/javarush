package com.javarush.tasts.level7.lesson9.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка,
 * и выведи оставшиеся элементы в обратном порядке.
 */

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            String str = reader.readLine();
            list.add(str);

        }

        list.remove(2);
        Collections.reverse(list);

        list.forEach(System.out::println);
    }
}
