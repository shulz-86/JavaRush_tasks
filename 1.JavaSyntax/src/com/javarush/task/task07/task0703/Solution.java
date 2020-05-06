package com.javarush.task.task07.task0703;

/* 
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];
        int[] num = new int[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = reader.readLine();
            num[i] = list[i].length();
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);

        }

    }
}
