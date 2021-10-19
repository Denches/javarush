package com.javarush.tasts.level5.lesson12.task4;

import java.util.Calendar;

/**
 Вывести на экран текущую дату в аналогичном виде «21 06 2015».
 */

public class Solution {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);

        System.out.println(day + " " + month + " " + year);
    }
}
