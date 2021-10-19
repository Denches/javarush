package com.javarush.tasts.level3.lesson12.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    /*
     Ввести с клавиатуры число n. Вывести на экран надпись «Я буду зарабатывать $n в час».

     Пример:
     Я буду зарабатывать $50 в час
     */

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sSalary = reader.readLine();

        int salary = Integer.parseInt(sSalary);

        System.out.println("Я буду зарабатывать " + "$" + salary + " в час");
    }
}
