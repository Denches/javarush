package com.javarush.tasts.level8.lesson11.bonustask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
 */

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            String str = reader.readLine();
            list.add(str);
        }

        Collections.sort(list);

        for (String s: list){
            System.out.println(s);
        }
    }
}
