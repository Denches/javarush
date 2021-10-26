package com.javarush.tasts.level8.lesson3.task1;

import java.util.HashSet;

/**
 * Создать коллекцию HashSet с типом элементов String.
 * Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
 * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 * Посмотреть, как изменился порядок добавленных элементов.
 */

public class Solution {

    public static void main(String[] args) {

        HashSet<String> strings = new HashSet<>();
        strings.add("арбуз");
        strings.add("банан");
        strings.add("вишня");
        strings.add("груша");
        strings.add("дыня");
        strings.add("ежевика");
        strings.add("жень-шень");
        strings.add("земляника");
        strings.add("ирис");
        strings.add("картофель");

        strings.forEach(System.out::println);

    }
}
