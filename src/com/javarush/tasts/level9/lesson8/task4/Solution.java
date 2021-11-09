package com.javarush.tasts.level9.lesson8.task4;

import java.io.IOException;
import java.rmi.RemoteException;

/**
 * В методе processExceptions обработайте все checked исключения.
 * Нужно вывести на экран каждое возникшее checked исключение.
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
        }catch (RemoteException e){
            System.out.println(e.getClass().getName());
        }catch (NoSuchFieldException e){
            System.out.println(e.getClass().getName());
        }catch (IOException e){
            System.out.println(e.getClass().getName());
        }

    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
