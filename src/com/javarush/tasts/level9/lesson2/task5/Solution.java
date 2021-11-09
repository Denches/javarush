package com.javarush.tasts.level9.lesson2.task5;

/**
 * Написать метод, который возвращает результат – глубину его стек трейса – количество методов в нем (количество элементов в списке).
 * Это же число метод должен выводить на экран.
 */

public class Solution {

    public static void main(String[] args) {

        System.out.println(getStackTraceDeep());
    }

    public static int getStackTraceDeep(){

        return Thread.currentThread().getStackTrace().length;

    }
}
