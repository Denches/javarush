package com.javarush.tasts.level8.lesson3.task2;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Создать коллекцию HashMap<String, String>, занести туда 10 пар строк: арбуз – ягода, банан – трава, вишня – ягода,
 * груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода, ирис – цветок, картофель – клубень.
 * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 *
 * Пример вывода (тут показана только одна строка):
 * картофель – клубень
 */

public class Solution {

    public static void main(String[] args) {

        HashMap<String, String> collection = new HashMap<>();

        collection.put("арбуз","ягода");
        collection.put("банан","трава");
        collection.put("вишня","ягода");
        collection.put("груша","фрукт");
        collection.put("дыня","овощ");
        collection.put("ежевика","куст");
        collection.put("жень-шень","корень");
        collection.put("земляника","ягода");
        collection.put("ирис","цветок");
        collection.put("картофель","клубень");

        for (HashMap.Entry<String, String> pair : collection.entrySet()){
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }



    }
}
