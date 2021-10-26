package com.javarush.tasts.level7.lesson12.bonustask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Программа вводит с клавиатуры данные про котов и выводит их на экран.
 *
 * Пример:
 * Cat name is Barsik, age is 6, weight is 5, tail = 22
 * Cat name is Murka, age is 8, weight is 7, tail = 20
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       ArrayList<Cat> cats = new ArrayList<>();

        while(true) {

            String name = reader.readLine();
            if (name.isEmpty())
                break;

            String sAge = reader.readLine();
            String sWeight = reader.readLine();
            String sTail = reader.readLine();

            Integer age = Integer.parseInt(sAge);
            Integer weight = Integer.parseInt(sWeight);
            Integer tail = Integer.parseInt(sTail);

            Cat cat = new Cat(name, age, weight, tail);

            cats.add(cat);
        }

        cats.forEach(System.out::println);
    }
}
