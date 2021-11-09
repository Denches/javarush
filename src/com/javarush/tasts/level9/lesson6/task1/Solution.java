package com.javarush.tasts.level9.lesson6.task1;

/**
 * Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
 * int a = 42 / 0;
 */

public class Solution {

    public static void main(String[] args) {


        try {
            int a = 42 / 0;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

}
