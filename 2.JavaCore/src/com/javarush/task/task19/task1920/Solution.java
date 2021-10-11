package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* 
Самый богатый
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
        Map.Entry<Integer, Integer> maxEntry = null;
        for (Map.Entry<String, Double> entry: treeMap.entrySet()) {
            if(entry.getValue().equals(Collections.max(treeMap.values()))) {
                System.out.println(entry.getKey());
            }
        }
        reader.close();
    }
}
