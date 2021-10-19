package com.javarush.tasts.level3.lesson6.task3;

public class Solution {

    /**
     Создать 7 объектов, чтобы на экран вывелись 7 цветов радуги (ROYGBIV).
     Каждый объект при создании выводит на экран определенный цвет.
     */

    public static void main(String[] args) {

        Red red = new Red();
        Orange orange = new Orange();
        Yellow yellow = new Yellow();
        Green green = new Green();
        Blue blue = new Blue();
        Indigo indigo = new Indigo();
        Violet violet = new Violet();
    }

     static class Red {
        public Red() {
            System.out.println("Red");
        }
    }

     static class Orange {
        public Orange() {
            System.out.println("Orange");
        }
    }

     static class Yellow {
        public Yellow() {
            System.out.println("Yellow");
        }
    }

     static class Green {
        public Green() {
            System.out.println("Green");
        }
    }

     static class Blue {
        public Blue() {
            System.out.println("Blue");
        }
    }

     static class Indigo {
        public Indigo() {
            System.out.println("Indigo");
        }
    }

     static class Violet {
        public Violet() {
            System.out.println("Violet");
        }
    }
}
