package com.javarush.tasts.level12.lesson12.bonustask2;

/**
 * Задача: Сделать класс Pegas(пегас) на основе класса Horse(лошадь) и интерфейса Fly(летать).
 */

public class Solution {

    public static void main(String[] args) {

        Pegas pegas = new Pegas();
    }

    static class Pegas extends Horse implements Fly{}
    static class Horse{}
    interface Fly{}
}
