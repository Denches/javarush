package com.javarush.tasts.level8.lesson11.task1;

import java.util.HashSet;
import java.util.Set;

/**
 * 1. Внутри класса Solution создать public static класс кот – Cat.
 * 2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него три кота.
 * 3. В методе main удалите одного кота из Set cats.
 * 4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
 * Каждый кот с новой строки.
 */

public class Solution {

    public static void main(String[] args) {

        Set<Cat> cats = createCat();

        cats.remove(cats.iterator().next());

        printCats(cats);
    }

    public static void printCats(Set<Cat> cats){
        cats.forEach(System.out::println);
    }

    public static Set<Cat> createCat(){

        Set<Cat> cats = new HashSet<>();

        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        return cats;
    }

    public static class Cat{


    }
}
