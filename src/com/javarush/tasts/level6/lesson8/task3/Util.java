package com.javarush.tasts.level6.lesson8.task3;

/**
 * Реализовать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
 * Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра
 */

class Util {

    public static double getDistance(int x1, int y1, int x2, int y2){
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
