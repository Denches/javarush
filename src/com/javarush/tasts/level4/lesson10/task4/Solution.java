package com.javarush.tasts.level4.lesson10.task4;

public class Solution {

    /**
     Вывести на экран квадрат из 10х10 букв S используя цикл while.
     Буквы в каждой строке не разделять.
     */

    public static void main(String[] args)  {

        int i = 0, k = 0;

        while (i < 10){

            while (k < 10){

                System.out.print("s");
                k++;
            }

            System.out.println();

            k = 0;
            i++;
        }
    }
}
