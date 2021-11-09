package com.javarush.tasts.level9.lesson11.task8;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать список, элементами которого будут массивы чисел. Добавить в список пять
 * объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
 */

public class Solution {

    public static void main(String[] args) {

        List<Integer[]> ints = new ArrayList<>();

        ints.add(new Integer[] {1,2,3,4,5});
        ints.add(new Integer[] {1,2});
        ints.add(new Integer[] {1,2,3,4});
        ints.add(new Integer[] {1,2,3,4,5,6,7});
        ints.add(new Integer[] {});

        for (Integer[] arr : ints){

            for (Integer i : arr){
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
