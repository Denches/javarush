package com.javarush.tasts.level8.lesson6.task3;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
 * Метод getTimeMsOfInsert должен вернуть время его исполнения в миллисекундах.
 */

public class Solution {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        ArrayList arrayList = new ArrayList();

        System.out.println(getTimeMsOfInsert(list));
        System.out.println(getTimeMsOfInsert(arrayList));
    }

    public static long getTimeMsOfInsert(List list){

        Date startTime = new Date();

        for (int i = 0; i < 10000; i++) {

            list.add(i);
        }

        Date endTime = new Date();

        return endTime.getTime() - startTime.getTime();
    }
}
