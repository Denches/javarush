package com.javarush.tasts.level7.lesson6.task1;

import java.util.ArrayList;

/**
 * 1. Создай список строк.
 * 2. Добавь в него 5 различных строчек.
 * 3. Выведи его размер на экран.
 * 4. Используя цикл, выведи его содержимое на экран, каждое значение с новой строки.
 */

public class Solution {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();

        strings.add("sdf1");
        strings.add("sdf2");
        strings.add("sdf3");
        strings.add("sdf4");
        strings.add("sdf5");

        System.out.println(strings.size());

        for (String s : strings){
            System.out.println(s);
        }

    }
}
