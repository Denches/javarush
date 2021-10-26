package com.javarush.tasts.level7.lesson12.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Создать список строк.
 * Ввести строки с клавиатуры и добавить их в список.
 * Вводить с клавиатуры строки, пока пользователь не введёт строку “end”. “end” не учитывать.
 * Вывести строки на экран, каждую с новой строки.
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();

        String str;

        for (;;){
            str = reader.readLine();

            if (!str.equals("end")){
                list.add(str);
            }else {
                break;
            }
        }

        list.forEach(System.out::println);
    }
}
