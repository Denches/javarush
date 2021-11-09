package com.javarush.tasts.level11.lesson11.task5;

/**
 * Написать четыре класса: Schoolboy(школьник), Student(студент), Worker(Сотрудник), Slave(Раб).
 * Унаследовать студента от школьника, сотрудника от студента, раба от сотрудника.
 */

public class Solution {

    public static void main(String[] args) {

    }

    public static class Schoolboy{}
    public static class Student extends Schoolboy{}
    public static class Worker extends Student{}
    public static class Slave extends Worker{}
}
