package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/* 
Самая длинная строка
*/
public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       strings = new ArrayList<String>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(s);
            if (strings.get(i).length() > max) {
                max = strings.get(i).length();
            }
        }
        for (int i = 0; i < 5; i++) {
            if (max == strings.get(i).length()) {
                System.out.println(strings.get(i));
            }
        }
    }
}
