package com.javarush.tasts.level6.lesson11.task5;

/**
 * 1) В классе Solution создать public статический класс Idea
 * 2) В классе Idea создать метод public String getDescription(),
 * который будет возвращать любой непустой текст
 * 3) В классе Solution создайте статический метод public void printIdea(Idea idea),
 * который будет выводить на экран описание идеи - это то, что возвращает метод getDescription
 */

public class Solution {

    public static void printIdea(Idea idea){

        System.out.println(idea.getDescription());
    }

    public static class Idea{

        public String getDescription(){

            return "new idea";
        }
    }

}
