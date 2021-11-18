package com.javarush.tasts.level12.lesson6.task4;

/**
 * Унаследуй класс Cow от Animal.
 * Реализуй все недостающие методы в классе Cow.
 */

public class Solution {

    public static void main(String[] args) {

        Animal cow = new Cow();
        cow.voice();

    }

    public abstract static class Animal{
        public abstract void voice();
    }
    public static class Cow extends Animal{

        @Override
        public void voice() {
            System.out.println("Myy");
        }
    }

}
