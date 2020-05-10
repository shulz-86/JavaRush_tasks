package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> cats = new HashMap<String, Cat>();
        cats.put("Vaska", new Cat("Васька"));
        cats.put("Guga", new Cat("Жужа"));
        cats.put("Masyanya", new Cat("Масяня"));
        cats.put("Baton", new Cat("Батон"));
        cats.put("Knopka", new Cat("Кнопка"));
        cats.put("Busya", new Cat("Буся"));
        cats.put("Kuzya", new Cat("Кузя"));
        cats.put("Khvostik", new Cat("Хвостик"));
        cats.put("Mamka", new Cat("Мамка"));
        cats.put("Shanya", new Cat("Шаня"));
        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> cats2 = new HashSet<>();
        //Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();
        //while (iterator.hasNext()) {
            for (Map.Entry<String, Cat> entry : map.entrySet()) {
                cats2.add(entry.getValue());
            }
        //}

        return cats2;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
