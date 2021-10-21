package com.javarush.tasts.level2.lesson8.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Написать функцию, которая возвращает минимум из трех чисел.
 */

public class Solution {

    public static void main(String[] args) {

        System.out.println(min(5, 3, 7));
    }

    public static int min(int a, int b, int c){

        int min = Math.min(a,b);

        return Math.min(min,c);
    }
}
