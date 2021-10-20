package com.javarush.tasts.level6.lesson11.bonustask2;

class Cat{

    private String name;
    private Cat mother;
    private Cat father;

    public Cat(String name, Cat mother, Cat father) {
        this.name = name;
        this.mother = mother;
        this.father = father;
    }

    @Override
    public String toString() {

        if (mother == null && father == null){
            return "Cat name is " + name + ", no mother, no father";
        }else if (father == null){
            return "Cat name is " + name + ", mother is " + mother.name + ", no father";
        }else if (mother == null){
            return "Cat name is " + name + ", no mother, father is " + father.name;
        }else {
            return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }
}