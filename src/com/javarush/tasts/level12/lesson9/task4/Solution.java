package com.javarush.tasts.level12.lesson9.task4;

/**
 * Есть public интерфейсы Fly(летать), Run(бежать/ездить), Swim(плавать).
 * Добавь эти интерфейсы классам Human(человек), Duck(утка), Penguin(пингвин), Airplane(самолет).
 */

public class Solution {

    public static void main(String[] args) {

    }

    public interface Fly{}
    public interface Run{}
    public interface Swim{}

    public static class Human implements Run, Swim{}
    public static class Duck implements Fly, Run, Swim{}
    public static class Penguin implements Run, Swim{}
    public static class Airplane implements Fly{}
}
