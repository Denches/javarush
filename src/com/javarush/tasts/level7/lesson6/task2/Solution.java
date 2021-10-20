package com.javarush.tasts.level7.lesson6.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 1. Создай список строк.
 * 2. Считай с клавиатуры 5 строк и добавь в список.
 * 3. Используя цикл, найди самую длинную строку в списке.
 * 4. Выведи найденную строку на экран.
 * 5. Если таких строк несколько, выведи каждую с новой строки.
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        ArrayList<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int length = 0;

        for (int i = 0; i < 5; i++) {

            String str = reader.readLine();
            list.add(str);
            if (list.get(i).length() > length){
                length = list.get(i).length();
            }
        }

        for (String s : list){
            if (s.length() == length)
                System.out.println(s);
        }
    }
}
