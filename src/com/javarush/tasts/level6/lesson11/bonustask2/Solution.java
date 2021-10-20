package com.javarush.tasts.level6.lesson11.bonustask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию.
 * Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
 * Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Создать класс,
 * который бы помог описать данную ситуацию. Создать 6 объектов: маму, папу, сына, дочь,
 * бабушку(мамина мама) и дедушку(папин папа). Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.
 *
 * Пример ввода:
 * дедушка Вася
 * бабушка Мурка
 * папа Котофей
 * мама Василиса
 * сын Мурчик
 * дочь Пушинка
 *
 * Пример вывода:
 * Cat name is дедушка Вася, no mother, no father
 * Cat name is бабушка Мурка, no mother, no father
 * Cat name is папа Котофей, no mother, father is дедушка Вася
 * Cat name is мама Василиса, mother is бабушка Мурка, no father
 * Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
 * Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
 */

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sGrFatherCat = reader.readLine();
        Cat grFatherCat = new Cat(sGrFatherCat,null, null);

        String sGrMotherCat = reader.readLine();
        Cat grMotherCat = new Cat(sGrMotherCat,null, null);

        String sFatherCat = reader.readLine();
        Cat FatherCat = new Cat(sFatherCat,null, grFatherCat);

        String sMotherCat = reader.readLine();
        Cat motherCat = new Cat(sMotherCat,grMotherCat, null);

        String sSonCat = reader.readLine();
        Cat sonCat = new Cat(sSonCat,motherCat, FatherCat);

        String sDaughterCat = reader.readLine();
        Cat daughterCat = new Cat(sDaughterCat,motherCat, FatherCat);

        System.out.println(grFatherCat);
        System.out.println(grMotherCat);
        System.out.println(FatherCat);
        System.out.println(motherCat);
        System.out.println(sonCat);
        System.out.println(daughterCat);
    }
}

