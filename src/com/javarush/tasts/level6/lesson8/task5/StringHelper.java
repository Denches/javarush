package com.javarush.tasts.level6.lesson8.task5;

/**
 * Cделать класс StringHelper, у которого будут 2 статических метода:
 * String multiply(String s, int count) – возвращает строку, повторенную count раз.
 * String multiply(String s) – возвращает строку, повторенную 5 раз.
 *
 * Пример:
 * Амиго → АмигоАмигоАмигоАмигоАмиго
 */

class StringHelper {

    static String multiply(String s, int count){

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < count; i++) {
            builder.append(s);
        }
        return builder.toString();
    }

    static String multiply(String s){

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            builder.append(s);
        }
        return builder.toString();
    }
}
