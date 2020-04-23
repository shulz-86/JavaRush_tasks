package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        zerg1.name = "Петя";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Вася";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Федя";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Кеша";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Гоша";
        Protoss protoss1 = new Protoss();
        protoss1.name = "Валя";
        Protoss protoss2 = new Protoss();
        protoss2.name = "Галя";
        Protoss protoss3 = new Protoss();
        protoss3.name = "Лиля";
        Terran terran1 = new Terran();
        terran1.name = "Атос";
        Terran terran2 = new Terran();
        terran2.name = "Портос";
        Terran terran3 = new Terran();
        terran3.name = "Арамис";
        Terran terran4 = new Terran();
        terran4.name = "Д'артаньян";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
