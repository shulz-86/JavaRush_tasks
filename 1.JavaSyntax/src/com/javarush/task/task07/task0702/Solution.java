package com.javarush.task.task07.task0702;
/* 
Массив из строчек в обратном порядке
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] num = new String[10];
        for (int i = 0; i < 8; i++) {
            String s = reader.readLine();
            num[i] = s;
        }

        for (int i = num.length - 1; i >= 0; i--) {

            System.out.println(num[i]);
        }
    }
}