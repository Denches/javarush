package com.javarush.tasts.level2.lesson8.task6;

/**
 * Написать функцию, которая выводит переданную строку (слово) на экран три раза, но в одной строке.
 * Слова должны быть разделены пробелом и не должны сливаться в одно.
 */

public class Solution {

    public static void main(String[] args) {

        print("Hello");
    }

    static void print(String str){

        for (int i = 0; i < 3; i++) {
            System.out.print(str + " ");
        }
    }
}
