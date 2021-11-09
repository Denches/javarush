package com.javarush.tasts.level9.lesson8.task2;

/**
 *Есть метод, который выбрасывает два исключения, унаследованные от Exception,
 *  и два унаследованных от RuntimeException: NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException.
 *
 * Нужно перехватить NullPointerException и FileNotFoundException, но не перехватывать ArithmeticException
 * и URISyntaxException. Как это сделать?
 */

public class Solution {

    public static void main(String[] args) {

        try {
            method1();
        } catch (Exception1 e){
            System.out.println(e.getMessage());
        }
    }

    public static void method1() throws Exception1, Exception2, Exception3 {

        int i = (int) (Math.random() * 3);
        if (i == 0)
            throw new Exception1();
        if (i == 1)
            throw new Exception2();
        if (i == 2)
            throw new Exception3();
    }
}
