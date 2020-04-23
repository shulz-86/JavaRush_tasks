package com.javarush.task.task04.task0436;

/* 
Рисуем прямоугольник
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        for (int a = n; a > 0; a--) {
            for (int i = m; i > 0; i--) {
                System.out.print("8");
            }
            System.out.println();
        }



    }
}
