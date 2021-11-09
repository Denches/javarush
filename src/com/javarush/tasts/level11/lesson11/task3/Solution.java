package com.javarush.tasts.level11.lesson11.task3;

/**
 * Написать четыре класса: Fish(Рыбы), Animal(Животные), Ape(Обезьяны), Human(Человек).
 * Унаследовать животных от рыб, обезьян от животных и человека от обезьян.
 */

public class Solution {

    public static void main(String[] args) {

    }

    public static class Fish{}
    public static class Animal extends Fish{}
    public static class Ape extends Animal{}
    public static class Human extends  Animal{}
}
