package com.javarush.tasts.level11.lesson6.task4;

/**
 * Написать четыре класса: Worker(сотрудник), Manager(управляющий), Chief(директор) и Secretary(секретарь).
 * Унаследовать управляющего, директора и секретаря от сотрудника.
 */

public class Solution {

    public static void main(String[] args) {

    }

    public static class Worker{}
    public static class Manager extends Worker{}
    public static class Chief extends Worker{}
    public static class Secretary extends Worker{}
}
