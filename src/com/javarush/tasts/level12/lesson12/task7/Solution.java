package com.javarush.tasts.level12.lesson12.task7;

/**
 * Есть интерфейсы Fly(летать), Swim(плавать), Run(бегать).
 * Добавь эти интерфейсы классам Duck(утка), Penguin(пингвин), Toad(жаба).
 */

public class Solution {

    public static void main(String[] args) {

    }

    interface Fly{}
    interface Run{}
    interface Swim{}

    static class Duck implements Fly, Run, Swim{}
    static class Penguin implements Run, Swim{}
    static class Toad implements Swim{}
}
