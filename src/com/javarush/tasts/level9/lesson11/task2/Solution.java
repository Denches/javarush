package com.javarush.tasts.level9.lesson11.task2;

/**
 * Написать в цикле обратный отсчёт от 10 до 0. Для задержки иcпользовать Thread.sleep(100);
 * Обернуть вызов sleep в try..catch.
 */

public class Solution {

    public static void main(String[] args) {

        for (int i = 10; i > 0; i--) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
