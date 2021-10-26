package com.javarush.tasts.level7.lesson12.task6;

/**
 *Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
 *
 * Примечание:
 * Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
 *
 * Пример вывода:
 * Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
 * Имя: Катя, пол: женский, возраст: 55
 * Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
 */

public class Solution {

    public static void main(String[] args) throws InterruptedException {

        Human grFather1 = new Human("Павел", "Мужской", 60, null, null);
        Human grFather2 = new Human("Михаил", "Мужской", 65, null, null);

        Human grMother1 = new Human("Ирина", "Мужской", 61, null, null);
        Human grMother2 = new Human("Мария", "Мужской", 62, null, null);

        Human father = new Human("Игорь", "Мужской", 42, grFather2, grMother1);
        Human mother = new Human("Аня", "Мужской", 38, grFather1, grMother2);

        Human son1 = new Human("Вадим", "Мужской", 22, father, mother);
        Human son2 = new Human("Саша", "Мужской", 18, father, mother);
        Human daughter = new Human("Полина", "Мужской", 15, father, mother);


        System.out.println(grFather1);
        System.out.println(grFather2);
        System.out.println(grMother1);
        System.out.println(grMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(daughter);
    }
}
