package com.javarush.tasts.level7.lesson9.task3;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Создай список из слов «мама», «мыла», «раму».
 * 2. После каждого слова вставь в список строку, содержащую слово «именно».
 * 3. Используя цикл for, вывести результат на экран. Каждый элемент списка с новой строки.
 */

public class Solution {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("мама");
        list.add("мыла");
        list.add("раму");

        for (int i = 0; i < list.size(); i++)
        {
            list.add(i + 1, "именно");
            i++;
        }

        for (String s : list){
            System.out.println(s);
        }
    }
}
