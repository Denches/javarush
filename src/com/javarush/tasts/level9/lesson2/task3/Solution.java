package com.javarush.tasts.level9.lesson2.task3;

/**
 * Написать пять методов, которые вызывают друг друга.
 * Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
 */

public class Solution {

    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        return stackTrace[2].getLineNumber();
    }

    public static int method2() {
        method3();
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method3() {
        method4();
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method4() {
        method5();
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method5() {
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

}
