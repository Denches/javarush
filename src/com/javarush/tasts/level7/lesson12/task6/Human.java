package com.javarush.tasts.level7.lesson12.task6;

public class Human {

    private String name;
    private String gender;
    private int age;
    private Human father;
    private Human mother;

    public Human(String name, String gender, int age, Human father, Human mother) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    @Override
    public String toString() {

        if (father == null && mother == null){
            return  "Имя: " + name + ", пол: " + gender + ", возраст: " + age;
        } else if (father == null){
            return  "Имя: " + name + ", пол: " + gender + ", возраст: " + age + ", мать: " + mother.name;
        }else if (mother == null){
            return  "Имя: " + name + ", пол: " + gender + ", возраст: " + age + ", отец: " + father.name;
        }else {
            return  "Имя: " + name + ", пол: " + gender + ", возраст: " + age + ", отец: " + father.name + ", мать: " + mother.name;
        }
    }
}
