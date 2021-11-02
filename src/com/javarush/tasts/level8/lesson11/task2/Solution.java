package com.javarush.tasts.level8.lesson11.task2;

import java.util.HashSet;
import java.util.Set;

/**
 * 1. Внутри класса Solution создать public static классы Cat, Dog.
 * 2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
 * 3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
 * 4. Реализовать метод join, который должен возвращать объединенное множество всех животных - всех котов и собак.
 * 5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
 * 6. Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
 */

public class Solution {

    public static void main(String[] args) {

        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets){
        pets.forEach(System.out::println);
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs){

        Set<Object> pets = new HashSet<>();

        pets.addAll(cats);
        pets.addAll(dogs);

        return pets;
    }

    public static Set<Cat> createCats(){

        Set<Cat> cats = new HashSet<>();

        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        return cats;
    }

    public static Set<Dog> createDogs(){

        Set<Dog> dogs = new HashSet<>();

        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());

        return dogs;
    }

    public static class Cat{}
    public static class Dog{}
}
