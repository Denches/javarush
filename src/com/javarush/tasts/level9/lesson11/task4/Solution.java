package com.javarush.tasts.level9.lesson11.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Ввести с клавиатуры дату в формате «08/18/2013»
 * Вывести на экран эту дату в виде «AUG 18, 2013».
 * Воспользоваться объектом Date и SimpleDateFormat.
 */

public class Solution {

    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();

        SimpleDateFormat formatFrom = new SimpleDateFormat("M/dd/yyyy");
        SimpleDateFormat formatTo = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);


        Date date = formatFrom.parse(str);

        System.out.println(formatTo.format(date).toUpperCase());

    }
}
