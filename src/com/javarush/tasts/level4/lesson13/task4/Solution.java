package com.javarush.tasts.level4.lesson13.task4;

public class Solution {

    /**
     Используя цикл for вывести на экран:
     - горизонтальную линию из 10 восьмёрок
     - вертикальную линию из 10 восьмёрок.
     */

    public static void main(String[] args)  {

        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {

                if (i == 0)
                System.out.print("8");
            }
            System.out.println("8");
        }

    }
}
