package com.javarush.tasts.level3.lesson8.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    /*
     Ввести с клавиатуры два имени и вывести надпись:
     name1 проспонсировал name2, и она стала известной певицей.

     Пример:
     Коля проспонсировал Лену, и она стала известной певицей.
     */

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstName = reader.readLine();
        String secondName = reader.readLine();

        System.out.println(firstName + " проспонсировал " + secondName + "," + " и она стала известной певицей.");
    }
}
