package com.javarush.tasts.level9.lesson11.task1;

/**
 * Создай метод public static void divisionByZero, в котором подели любое число на ноль и выведи на экран результат деления.
 * Оберни вызов метода divisionByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()
 */

public class Solution {

    public static void main(String[] args) {

        try {
            divisionByZero();
        } catch (ArithmeticException e){
            e.printStackTrace();
        }
    }

    public static void divisionByZero(){

        int i = 10 / 0;

        System.out.println(i);
    }
}
