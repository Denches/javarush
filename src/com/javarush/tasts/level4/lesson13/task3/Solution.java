package com.javarush.tasts.level4.lesson13.task3;

public class Solution {

    /**
     Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.

     Пример:
     8
     88
     888
     ...
     */

    public static void main(String[] args)  {

        for (int i = 0; i < 10; i++) {
            for (int k = 0; k <= i; k++) {

                System.out.print("8");
            }
            System.out.println();
        }

    }
}
