package com.javarush.tasts.level3.lesson8.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    /*
     Ввести с клавиатуры имя и вывести надпись: name зарабатывает $5,000. Ха-ха-ха!

     Пример:
     Тимур зарабатывает $5,000. Ха-ха-ха!
     */

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sSalary = reader.readLine();

        int salary = Integer.parseInt(sSalary);

        System.out.println(name + " зарабатывает " + "$" + salary + "." + " Ха-ха-ха!");
    }
}
