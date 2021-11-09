package com.javarush.tasts.level10.lesson11.bonustask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Задача: Программа демонстрирует работу HashMap: вводит с клавиатуры набор пар (номер и строку),
 * помещает их в HashMap и выводит на экран содержимое HashMap.
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer,String> map = new HashMap<>();

        while(true){

            String str = reader.readLine();

            if (str.equals("")) break;

            String[] arr = str.split(" ");

            int key = Integer.parseInt(arr[0]);
            String value = arr[1];

            map.put(key, value);
        }

        for (Map.Entry<Integer,String> pair : map.entrySet()){

            Integer key = pair.getKey();
            String value = pair.getValue();

            System.out.println(key + " - " + value);
        }
    }
}
