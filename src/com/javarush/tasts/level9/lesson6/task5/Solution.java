package com.javarush.tasts.level9.lesson6.task5;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
 * HashMap<String, String> map = new HashMap<String, String>(null);
 * map.put(null, null);
 * map.remove(null);
 */

public class Solution {

    public static void main(String[] args) {


        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

}
