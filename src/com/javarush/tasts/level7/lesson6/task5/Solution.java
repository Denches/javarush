package com.javarush.tasts.level7.lesson6.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 1. Создай список строк.
 * 2. Добавь в него 5 строчек с клавиатуры.
 * 3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
 * 4. Используя цикл, выведи содержимое на экран, каждое значение с новой строки.
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        ArrayList<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {

            String str = reader.readLine();
            list.add(str);
        }
        for (int i = 0; i < 13; i++) {

            list.add(0, list.remove(4));
        }

        for (String s : list){
            System.out.println(s);
        }
    }
}
