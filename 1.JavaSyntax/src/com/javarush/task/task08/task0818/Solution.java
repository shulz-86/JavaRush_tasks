package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Иванов", 100);
        map.put("Петров", 600);
        map.put("Федоров", 250);
        map.put("Булкин", 1000);
        map.put("Котов", 160);
        map.put("Кулина", 550);
        map.put("Батонов", 501);
        map.put("Хвостов", 300);
        map.put("Сидоров", 499);
        map.put("Петрова", 620);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Integer salary = iterator.next().getValue();
            if (salary < 500) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        /*Map<String, Integer> map = createMap();
        System.out.println(map);
        removeItemFromMap(map);
        System.out.println(map);*/
    }
}