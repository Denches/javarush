package com.javarush.tasts.level8.lesson6.task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для выполнения данных операций
 * (быстрее всего справится с большим количеством операций). Ничего измерять не нужно.
 */

public class Solution {

    public static void main(String[] args) {


    }

    public static List getListForGet()
    {
        return new ArrayList<Object>();

    }

    public static List getListForSet()
    {
        return new ArrayList<Object>();

    }

    public static List getListForAddOrInsert()
    {
        return new LinkedList<Object>();

    }

    public static List getListForRemove()
    {
        return new LinkedList<Object>();

    }
}
