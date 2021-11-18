package com.javarush.tasts.level12.lesson12.task9;

/**
 * Добавь такой класс-родитель к классу CTO(технический директор), чтобы класс перестал быть абстрактным.
 * Добавлять/реализовывать методы в классе CTO запрещается.
 */

public class Solution {

    public static void main(String[] args) {

    }

    public interface Businessman{
        void work();
    }
    public static class Parent {
        public void work(){

        }
    }
    public static class CTO extends Parent implements Businessman {}
}
