package com.javarush.tasts.level5.lesson7.task4;

/**
 Создать класс (Circle) круг, с тремя инициализаторами:
 - centerX, centerY, radius
 - centerX, centerY, radius, width
 - centerX, centerY, radius, width, color
 */

public class Circle {

    private int centerX;
    private int centerY;
    private int radius;
    private int width;

    private String color;

    public void initialize(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public void initialize(int centerX, int centerY, int radius, int width) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public void initialize(int centerX, int centerY, int radius, int width, String color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
}
