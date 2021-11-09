package com.javarush.tasts.level10.lesson11.task8;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
 */

public class Solution {

    public static void main(String[] args) {

        var list = new ArrayList<List<String>>();

        list.add(new ArrayList<>());
        list.get(0).add("hi");
        list.get(0).add("hi2");
        list.add(new ArrayList<>());
        list.get(1).add("s1");
        list.get(1).add("w2");
        list.get(1).add("w22");

        for (List<String> list1 : list){
            for (String s : list1){
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
