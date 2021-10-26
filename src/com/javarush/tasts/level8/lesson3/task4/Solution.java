package com.javarush.tasts.level8.lesson3.task4;

import java.util.HashMap;

/**
 * Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
 * Вывести на экран список ключей, каждый элемент с новой строки.
 */

public class Solution {

    public static void main(String[] args) {

        HashMap<String, String> collection = new HashMap<>();

        for (int i = 0; i < 10; i++) {

            collection.put("str" + i, Integer.toString(i));
        }

        for (HashMap.Entry<String, String> pair : collection.entrySet()){
            System.out.println(pair.getKey());
        }
    }
}
