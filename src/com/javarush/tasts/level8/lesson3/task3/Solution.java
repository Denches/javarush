package com.javarush.tasts.level8.lesson3.task3;

import java.util.HashMap;

/**
 * Есть класс Cat, с полем имя (name, String).
 * Создать коллекцию HashMap<String, Cat>.
 * Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
 * Вывести результат на экран, каждый элемент с новой строки.
 */

public class Solution {

    public static void main(String[] args) {

        HashMap<String, Cat> collection = new HashMap<>();

        for (int i = 0; i < 10; i++) {

            Cat cat = new Cat();
            cat.setName("cat" + i);
            collection.put(cat.getName(), cat);
        }

        for (HashMap.Entry<String, Cat> pair : collection.entrySet()){
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }



    }
}
