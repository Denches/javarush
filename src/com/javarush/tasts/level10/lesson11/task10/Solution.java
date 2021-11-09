package com.javarush.tasts.level10.lesson11.task10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Создать список целых чисел. Ввести с клавиатуры 20 целых чисел. Создать метод по безопасному извлечению чисел из списка:
 * int safeGetElement(ArrayList<Integer> list, int index, int defaultValue)
 *
 * Метод должен возвращать элемент списка (list) по его индексу (index). Если в процессе получения элемента возникло и
 * сключение, его нужно перехватить, и метод должен вернуть defaultValue
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            String sNumber = reader.readLine();

            Integer number = Integer.parseInt(sNumber);

            list.add(number);
        }

        System.out.println(safeGetElement(list,21,0));
    }

    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue){

        try {
            return list.get(index);
        }
        catch (IndexOutOfBoundsException e){
            return defaultValue;
        }
    }
}
