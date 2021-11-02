package com.javarush.tasts.level8.lesson11.task9;

import java.util.Date;

/**
 * 1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
 * 2. String date передается в формате MAY 1 2013
 * Не забудьте учесть первый день года.
 *
 * JANUARY 1 2000 = true
 * JANUARY 2 2020 = false
 */

public class Solution {

    public static void main(String[] args) {

        System.out.println(isDateOdd("JANUARY 1 2000"));
    }

    public static boolean isDateOdd(String date){

        Date yearBegin = new Date(2021,0,1);
        Date dateNow = new Date(date);

        long diff = dateNow.getTime()  - yearBegin.getTime();
        long days = diff / (24 * 60 * 60 * 1000);

        return days % 2 == 0;
    }
}
