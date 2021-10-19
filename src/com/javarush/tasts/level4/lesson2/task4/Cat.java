package com.javarush.tasts.level4.lesson2.task4;

class Cat {

    /**
     Реализовать метод setName, чтобы с его помощью можно было устанавливать
     значение переменной private String fullName равное значению локальной
     переменной String fullName.
     */

    private String fullName;
    public void setName(String firstName, String lastName)
    {
        String fullName = firstName + lastName;
        this.fullName = fullName;
    }
}
