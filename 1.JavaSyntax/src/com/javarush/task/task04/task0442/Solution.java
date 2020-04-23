package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int s = 0;
        while (true) {
            int number = Integer.parseInt(reader.readLine());
            s = s + number;
            if (number == -1) {
                break;
            }
        }
        System.out.println(s);
    }
}
