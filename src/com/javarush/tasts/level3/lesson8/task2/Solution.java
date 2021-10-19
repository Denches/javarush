package com.javarush.tasts.level3.lesson8.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    /*
     Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись: «Имя» получает «число1» через «число2» лет.

     Пример:
     Коля получает 3000 через 5 лет.
     */

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sSalary = reader.readLine();
        String sYear = reader.readLine();

        int salary = Integer.parseInt(sSalary);
        int year = Integer.parseInt(sYear);

        System.out.println(name + " получает " + salary + " через " + year + " лет.");
    }
}
