package com.javarush.task.task08.task0815;

import java.util.*;

/*
Перепись населения
*/
public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Петр");
        map.put("Федоров", "Федор");
        map.put("Булкин", "Григорий");
        map.put("Котов", "Иван");
        map.put("Кулина", "Дуся");
        map.put("Батонов", "Паша");
        map.put("Хвостов", "Николай");
        map.put("Сидоров", "Николай");
        map.put("Петрова", "Аня");

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int x = 0;
        for (Map.Entry<String, String> n : map.entrySet()) {
            if (n.getValue().equals(name)) {
                x++;
            }
        }
        return x;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int x = 0;
        for (Map.Entry<String, String> n : map.entrySet()) {
            if (n.getKey().equals(lastName)) {
                x++;
            }
        }
        return x;

    }

    public static void main(String[] args) {
        //Map<String, String> map = createMap();
        //System.out.println(getCountTheSameFirstName(map, "Иван"));
        //System.out.println(getCountTheSameLastName(map, "Булкин"));

    }
}
