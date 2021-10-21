package com.javarush.tasts.level2.lesson8.task5;

/**
 * Написать функцию, которая выводит переданную строку на экран три раза, каждый раз с новой строки.
 */

public class Solution {

    public static void main(String[] args) {

        print("Hello");
    }

    static void print(String str){

        for (int i = 0; i < 3; i++) {
            System.out.println(str);
        }
    }
}
