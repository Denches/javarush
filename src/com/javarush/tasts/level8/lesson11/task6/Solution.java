package com.javarush.tasts.level8.lesson11.task6;

import java.util.Arrays;
import java.util.Collections;

/**
 * 1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
 * 2. Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
 * 3. Вывести все объекты Human на экран.
 */

public class Solution {

    public static void main(String[] args){

        Human child1 = new Human("Max","male",10);
        Human child2 = new Human("Ivan","male",14);
        Human child3 = new Human("Mary","female",12);

        Human mother = new Human("Jill","female",35);
        mother.setChildren(Arrays.asList(child1,child2,child3));

        Human father = new Human("Din","male",35);
        father.setChildren(Arrays.asList(child1,child2,child3));

        Human drFather1 = new Human("Tom","male",65);
        drFather1.setChildren(Collections.singletonList(mother));

        Human drFather2 = new Human("Greg","male",63);
        drFather2.setChildren(Collections.singletonList(father));

        Human drMother1 = new Human("Judy","female",60);
        drMother1.setChildren(Collections.singletonList(mother));

        Human drMother2 = new Human("Helen","female",58);
        drMother2.setChildren(Collections.singletonList(father));


        System.out.println(drFather1);
        System.out.println(drFather2);
        System.out.println(drMother1);
        System.out.println(drMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }
}
