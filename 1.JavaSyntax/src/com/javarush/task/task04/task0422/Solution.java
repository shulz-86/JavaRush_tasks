package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int years = Integer.parseInt(reader.readLine());
        if (years < 18) {
            System.out.println("Подрасти еще");
        }

    }
}
