package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        Set<String> duplicateNames = new HashSet<>();
        while (iterator.hasNext()) {
            int x = 0;
            String name = iterator.next().getValue();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue().equals(name)) {
                    x++;
                }
            }
            if (x > 1) {
                duplicateNames.add(name);
            }
        }
        /*for (int i = 0; i < duplicateNames.size(); i++) {
            removeItemFromMapByValue(map, duplicateNames.get(i));
        }*/
        for (String duplicateName: duplicateNames) {
            removeItemFromMapByValue(map, duplicateName);
        }
        //duplicateNames.forEach(duplicateName->removeItemFromMapByValue(map, duplicateName));
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        map.entrySet().removeIf(n -> n.getValue().equals(value));
    }

    public static void main(String[] args) {
        /*Map<String, String> map = createMap();
        System.out.println(map);
        removeTheFirstNameDuplicates(map);
        System.out.println(map);*/
    }
}
