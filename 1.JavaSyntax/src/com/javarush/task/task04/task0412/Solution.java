package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        if (x > 0) {
            System.out.println(x * 2);
        } else if (x < 0) {
            System.out.println(x + 1);
        } else {
            System.out.println(x);
        }
        
    }

}