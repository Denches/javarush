package com.javarush.tasts.level9.lesson11.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
 * Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа и BufferedReader -
 * а) этого метода в try..catch.
 * Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести
 * на экран все введенные числа в качестве результата.
 * Числа выводить с новой строки сохраняя порядок ввода.
 */

public class Solution {

    public static void main(String[] args) {

        readData();
    }

    public static void readData(){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();

        try{
            while (true){

                String sNumber = reader.readLine();
                Integer number = Integer.parseInt(sNumber);
                list.add(number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }catch (NumberFormatException e){
            for (Integer i : list) {
                System.out.println(i);
            }
        }

    }
}
