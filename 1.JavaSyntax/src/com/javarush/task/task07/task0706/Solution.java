package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Улицы и дома
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[15];
        int a = 0;
        int b = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(reader.readLine());
            if (i % 2 != 0) {
                b += num[i];
            } else {
                a += num[i];
            }
        }
        if (a > b) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }

    }
}
