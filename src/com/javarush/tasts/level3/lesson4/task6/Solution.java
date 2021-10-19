package com.javarush.tasts.level3.lesson4.task6;

public class Solution {

    /**
     Вывести на экран сумму чисел от 1 до 10 построчно:
     1
     1+2=3
     1+2+3=6
     1+2+3+4=10
     ...
     */

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 10; i++){

            sum += i;

            System.out.println(sum);
        }


    }
}
