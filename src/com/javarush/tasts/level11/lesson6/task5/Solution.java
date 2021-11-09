package com.javarush.tasts.level11.lesson6.task5;

/**
 * Написать девять классов: Worker(сотрудник), Clerk(клерк), IT(ИТ-специалист), Programmer(программист),
 * ProjectManager(менеджер проекта), CTO(технический директор), HR(рекрутер), OfficeManager(офис-менеджер), Cleaner(уборщик).
 * Унаследовать программиста, менеджера проекта и технического директора от ИТ-специалиста.
 * Унаследовать рекрутера, уборщика и офис-менеджера от клерка.
 * Унаследовать клерка и ИТ-специалиста от сотрудника.
 */

public class Solution {

    public static void main(String[] args) {

    }
    public static class Worker{}
    public static class Clerk extends Worker{}
    public static class IT extends Worker{}
    public static class Programmer extends IT{}
    public static class ProjectManager extends IT{}
    public static class CTO extends IT{}
    public static class HR extends Clerk{}
    public static class OfficeManager extends Clerk{}
    public static class Cleaner extends Clerk{}
}
