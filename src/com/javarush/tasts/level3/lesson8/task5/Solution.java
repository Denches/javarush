package com.javarush.tasts.level3.lesson8.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    /*
     Ввести с клавиатуры три имени, вывести на экран надпись name1 + name2 + name3 = Чистая любовь, да-да!

     Пример:
     Вася + Ева + Анжелика = Чистая любовь, да-да!
     */

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String nameFirst = reader.readLine();
        String nameSecond = reader.readLine();
        String nameThird = reader.readLine();

        System.out.println(nameFirst + " + " + nameSecond + " + " + nameThird + " = Чистая любовь, да-да!");
    }
}
