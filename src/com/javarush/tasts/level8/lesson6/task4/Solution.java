package com.javarush.tasts.level8.lesson6.task4;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
 * Метод getTimeMsOfGet должен вернуть время его исполнения в миллисекундах.
 */

public class Solution {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        ArrayList arrayList = new ArrayList();

        System.out.println(getTimeMsOfGet(list));
        System.out.println(getTimeMsOfGet(arrayList));
    }

    public static long getTimeMsOfGet(List list){

        for (int i = 0; i < 10000; i++) {

            list.add(i);
        }

        Date startTime = new Date();

        for (int i = 0; i < 10000; i++) {

            list.get(i);
        }

        Date endTime = new Date();

        return endTime.getTime() - startTime.getTime();
    }
}
