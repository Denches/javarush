package com.javarush.tasts.level12.lesson12.task8;

/**
 * Добавь как можно больше интерфейсов к классу Human, но чтобы он не стал абстрактным классом.
 * Добавлять методы в класс Human запрещается.
 */

public class Solution {

    public static void main(String[] args) {

    }

    public interface Worker
    {
        void workLazy();
    }

    public interface Businessman
    {
        void workHard();
    }

    public interface Secretary
    {
        void workLazy();
    }

    public interface Miner
    {
        void workVeryHard();
    }

    public static class Human implements Worker, Businessman, Secretary
    {

        public void workHard()
        {
        }

        public void workLazy()
        {
        }
    }
}
