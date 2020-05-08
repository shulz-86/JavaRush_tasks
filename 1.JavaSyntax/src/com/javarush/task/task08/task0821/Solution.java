package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Петр");
        map.put("Федоров", "Федор");
        map.put("Булкин", "Григорий");
        map.put("Котов", "Иван");
        map.put("Кулина", "Дуся");
        map.put("Батонов", "Паша");
        map.put("Булкин", "Николай");
        map.put("Сидоров", "Николай");
        map.put("Петрова", "Аня");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
