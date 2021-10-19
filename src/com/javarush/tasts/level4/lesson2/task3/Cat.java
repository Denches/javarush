package com.javarush.tasts.level4.lesson2.task3;

class Cat {

    /**
     Реализовать метод setCatsCount так, чтобы с его помощью можно было
     устанавливать значение переменной catsCount равное переданному параметру.
     */

    private static int catsCount = 0;
    public static void setCatsCount(int catsCount)
    {
       Cat.catsCount = catsCount;
    }
}
