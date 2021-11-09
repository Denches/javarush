package com.javarush.tasts.level9.lesson6.task3;

/**
 * Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
 * int[] m = new int[2];
 * m[8] = 5;
 */

public class Solution {

    public static void main(String[] args) {


        try {
            int[] m = new int[2];
            m[8] = 5;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }

}
