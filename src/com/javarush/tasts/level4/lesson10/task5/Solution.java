package com.javarush.tasts.level4.lesson10.task5;

public class Solution {

    /**
     Вывести на экран таблицу умножения 10х10 используя цикл while.
     Числа разделить пробелом.

     Example output:
     1	2	3	4	5	6	7	8	9	10
     2	4	6	8	10	12	14	16	18	20
     3	6	9	12	15	18	21	24	27	30
     ...
     */

    public static void main(String[] args)  {

        int i = 1, k = 1;

        while (i <= 10){

            while (k <= 10){

                System.out.print(i * k + " ");
                k++;
            }

            System.out.println();

            k = 1;
            i++;
        }
    }
}
