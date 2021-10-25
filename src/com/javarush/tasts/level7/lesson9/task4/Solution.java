package com.javarush.tasts.level7.lesson9.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1. Создай список слов, заполни его самостоятельно.
 * 2. Метод fix() должен:
 * 2.1. удалять из списка строк все слова, содержащие букву «р»
 * 2.2. удваивать все слова содержащие букву «л».
 * 2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
 * 2.4. с другими словами ничего не делать.
 *
 * Пример:
 * роза
 * лира
 * лоза
 * Выходные данные:
 * лира
 * лоза
 * лоза
 */

public class Solution {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Collections.addAll(list,"роза", "лира", "лоза");

        fix(list);

        list.forEach(System.out::println);

    }

    public static void fix(List<String> list){

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.contains("р") && s.contains("л")) {
                continue;
            }else if (s.contains("р")) {
                list.remove(i);
            }else if (s.contains("л")){
                list.add(i,list.get(i));
                i++;
            }
        }
    }
}
