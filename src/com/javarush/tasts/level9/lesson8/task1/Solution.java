package com.javarush.tasts.level9.lesson8.task1;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/**
 * Есть три исключения последовательно унаследованные от Exception:
 * class Exception1 extends Exception
 * class Exception2 extends Exception1
 * class Exception3 extends Exception2
 * Есть метод, который описан так:
 * public static void method1() throws Exception1, Exception2, Exception3
 *
 * Напиши catch, который перехватит все три Exception1, Exception2 и Exception3
 */

public class Solution {

    public static void main(String[] args) throws ArithmeticException, URISyntaxException {

        try {
            method1();
        }catch (NullPointerException | FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public static void method1()throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {


    }
}
