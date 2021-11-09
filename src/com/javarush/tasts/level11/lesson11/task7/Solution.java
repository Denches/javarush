package com.javarush.tasts.level11.lesson11.task7;

/**
 * Расставь правильно «цепочку наследования» в классах: Pet(домашнее животное),
 * Cow(корова), Dog(собака), Pig(свинья), Animal(животное).
 */

public class Solution {

    public static void main(String[] args) {

    }

    public static class Pet extends Animal{}
    public static class Cow extends Animal{}
    public static class Dog extends Pet{}
    public static class Pig extends Animal{}
    public static class Animal{}
}
