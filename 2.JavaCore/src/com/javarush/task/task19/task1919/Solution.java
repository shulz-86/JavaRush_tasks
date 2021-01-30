package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> treeMap = new TreeMap<>();

        while (reader.ready()) {
            String[] s = reader.readLine().split(" ");
            if (treeMap.containsKey(s[0])) {
                treeMap.put(s[0], treeMap.get(s[0])+Double.parseDouble(s[1]));
            }
            else {
                treeMap.put(s[0], Double.parseDouble(s[1]));
            }
        }

        for (Map.Entry<String, Double> entry: treeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        reader.close();
    }
}
