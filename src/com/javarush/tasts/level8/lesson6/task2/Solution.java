package com.javarush.tasts.level8.lesson6.task2;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.
 */

public class Solution {

    public static void main(String[] args) {


        LinkedList list = new LinkedList();
        ArrayList arrayList = new ArrayList();

        for (int i = 0; i < 10000; i++) {

            list.add(i);
            list.get(i);
            list.set(i, i);

            arrayList.add(i);
            arrayList.get(i);
            arrayList.set(i,i);
        }
    }
}
