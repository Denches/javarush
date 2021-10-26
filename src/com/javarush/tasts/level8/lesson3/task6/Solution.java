package com.javarush.tasts.level8.lesson3.task6;

import java.util.HashMap;
import java.util.List;

/**
 * Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
 * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 *
 * Пример вывода (тут показана только одна строка):
 * Sim - 5
 */

public class Solution {

    public static void main(String[] args) {

        HashMap<String, Object> collection = new HashMap<>();

        collection.put("Sim", 5);
        collection.put("Dog", "Dog");
        collection.put("Big", 999999999);
        collection.put("double", 2.3);
        collection.put("null", null);
        collection.put("Obj", new Object());
        collection.put("Float", 2.4f);
        collection.put("Long", 33L);
        collection.put("list", "list");
        collection.put("1", 1);

        for (HashMap.Entry<String, Object> pair : collection.entrySet()){
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
