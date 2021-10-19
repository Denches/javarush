package com.javarush.tasts.level6.lesson8.task2;

/**
 * Добавить к классу Cat два статических метода: int getCatCount() и setCatCount(int),
 * с помощью которых можно получить/изменить количество котов (переменную catCount)
 */

class Cat {

    private static int catCount;

    public Cat(){
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    public static void setCatCount(int catCount) {
        Cat.catCount = catCount;
    }
}