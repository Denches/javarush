package com.javarush.tasts.level11.lesson11.bonustask2;

/**
 * Добавь общий базовый класс к классам-фигур: (фигуры из шахмат).
 */

public class Solution {

    public static void main(String[] args) {

    }

    class ChessItem { }
    class King extends ChessItem { }
    class Queen extends ChessItem { }
    class Rook extends ChessItem { }
    class Knight extends ChessItem { }
    class Bishop extends ChessItem { }
    class Pawn extends ChessItem { }
}
