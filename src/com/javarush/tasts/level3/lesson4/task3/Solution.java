package com.javarush.tasts.level3.lesson4.task3;

public class Solution {

    public static void main(String[] args) {

        Zerg[] zergs = new Zerg[10];
        Protoss[] protosses = new Protoss[5];
        Terran[] terrans = new Terran[12];

        for (int i = 0; i < zergs.length; i++) {
            zergs[i] = new Zerg();
            zergs[i].name = "zerg" + i;
        }

        for (int i = 0; i < protosses.length; i++) {
            protosses[i] = new Protoss();
            protosses[i].name = "protos" + i;
        }

        for (int i = 0; i < terrans.length; i++) {
            terrans[i] = new Terran();
            terrans[i].name = "terran" + i;
        }

    }

    static class Zerg {
        public String name;
    }

    static class Protoss {
        public String name;
    }

    static class Terran {
        public String name;
    }
}
