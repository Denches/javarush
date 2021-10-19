package com.javarush.tasts.level3.lesson6.task2;

public class Solution {

    /**
     Выведи на экран таблицу умножения 10 на 10 в следующем виде:
        1 2 3 …
        2 4 6 …
        3 6 9 …
        …
     */

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            for (int k = 1; k <= 10; k++){

                System.out.print(k*i + " ");
            }
            System.out.println();
        }
    }
}
