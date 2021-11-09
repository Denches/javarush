package com.javarush.tasts.level9.lesson11.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Написать программу, которая вводит с клавиатуры строку текста.
 * Программа должна вывести на экран две строки:
 * 1) первая строка содержит только гласные буквы
 * 2) вторая - только согласные буквы и знаки препинания из введённой строки.
 * Символы соединять пробелом, каждая строка должна заканчиваться пробелом.
 *
 * Пример ввода:
 * Мама мыла раму.
 * Пример вывода:
 * а а ы а а у
 * М м м л р м .
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Character> vowels = new ArrayList<>();
        List<Character> consonants = new ArrayList<>();

        String str = reader.readLine();

        for (int i = 0; i < str.length(); i++) {
            String s = Character.toString(str.charAt(i));
            if (s.matches("(?ui:[аеёиоуыэюя])")){
                vowels.add(str.charAt(i));
            }
            if (s.matches("(?ui:[йцкнгшщзхфвпрлджбтмсч.,;?!])")){
                consonants.add(str.charAt(i));
            }
        }

        for (Character character : vowels){
            System.out.print(character + " ");
        }

        System.out.println();

        for (Character character : consonants){
            System.out.print(character + " ");
        }
    }
}
