package com.javarush.tasts.level3.lesson6.task4;

public class Solution {

    /**
     Про экранирование символов в Java читайте в дополнительном материале к лекции. Вывести на экран следующий текст - две строки:
     It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
     It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
     */

    public static void main(String[] args) {

        System.out.println("It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
        System.out.println("It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"");
    }
}
