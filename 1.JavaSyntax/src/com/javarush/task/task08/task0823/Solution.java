package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        StringBuilder result = new StringBuilder();
        if (string == null || string.isEmpty()) {
            string = "";
        }
        String[] words = string.trim().replaceAll("\\s+", " ").split(" ");
        for (String word : words) {
            result.append(word.substring(0, 1).toUpperCase())
                    .append(word.substring(1))
                    .append(" ");
        }


        System.out.println(result.toString().trim());
    }
}

//jhjhgjhg jgjhgjhgj jgjhgjh g
//[jhjhgjhg, jgjhgjhgj, jgjhgjh, g]