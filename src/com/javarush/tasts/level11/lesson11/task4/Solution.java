package com.javarush.tasts.level11.lesson11.task4;

/**
 * Написать три класса: Judaism(Иудаизм), Christianity(Христианство), Islam(Мусульманство).
 * Унаследовать христианство от иудаизма и мусульманство от христианства.
 */

public class Solution {

    public static void main(String[] args) {

    }

    public static class Judaism{}
    public static class Christianity extends Judaism{}
    public static class Islam extends Christianity{}
}
