package com.javarush.tasts.level12.lesson9.task3;

/**
 * Есть public интерфейсы Fly(летать), Move(передвигаться), Eat(есть).
 * Добавь эти интерфейсы классам Dog(собака), Car(автомобиль), Duck(утка), Airplane(самолет).
 */

public class Solution {

    public static void main(String[] args) {

    }

    public interface Fly{}
    public interface Move{}
    public interface Eat{}

    public static class Dog implements Move, Eat{}
    public static class Car implements Move{}
    public static class Duck implements Move, Eat, Fly{}
    public static class Airplane implements Fly, Move{}
}
