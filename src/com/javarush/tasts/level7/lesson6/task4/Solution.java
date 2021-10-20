package com.javarush.tasts.level7.lesson6.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 1. Создай список строк в методе main.
 * 2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
 * 3. Используя цикл, выведи содержимое на экран, каждое значение с новой строки.
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        ArrayList<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {

            String str = reader.readLine();
            list.add(0,str);
        }

        for (String s : list){
            System.out.println(s);
        }
    }
}
