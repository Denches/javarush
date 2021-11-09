package com.javarush.tasts.level11.lesson11.task10;

/**
 * Расставь правильно «цепочку наследования» в классах: House(дом),
 * Cat(кот), Dog(собака), Car(машина), Animal(животное), Assets(имущество).
 */

public class Solution {

    public static void main(String[] args) {

    }

    public static class House extends Assets{}
    public static class Cat extends Animal{}
    public static class Dog extends Animal{}
    public static class Car extends Assets{}
    public static class Animal{}
    public static class Assets{}
}
