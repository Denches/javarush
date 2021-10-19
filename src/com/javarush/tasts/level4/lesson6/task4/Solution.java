package com.javarush.tasts.level4.lesson6.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    /**
     Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны».
     Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
     */

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstName = reader.readLine();
        String secondName= reader.readLine();

        if (firstName.equals(secondName)){

            System.out.println("Имена идентичны");

        }else if (firstName.length() == secondName.length()){

            System.out.println("Длины имен равны");
        }
    }
}
