package com.javarush.tasts.level9.lesson6.task2;

/**
 * Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
 * String s = null;
 * String m = s.toLowerCase();
 */

public class Solution {

    public static void main(String[] args) {


        try {
            String s = null;
            String m = s.toLowerCase();
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

}
