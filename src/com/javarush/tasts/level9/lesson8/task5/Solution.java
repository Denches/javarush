package com.javarush.tasts.level9.lesson8.task5;

/**
 * В методе processExceptions обработайте все unchecked исключения.
 * Нужно вывести стек-трейс каждого возникшего исключения используя метод printStack.
 * Можно использовать только один блок try.
 */

public class Solution {

    public static void main(String[] args) {
        processExceptions(new Solution());
    }

    public static void processExceptions(Solution solution){

        try {
            solution.method1();
            solution.method2();
            solution.method3();
        } catch (NumberFormatException | IndexOutOfBoundsException | NullPointerException e) {
            printStack(e);
        }

    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1(){
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}
