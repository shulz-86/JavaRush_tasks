package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = 0;
        double n = 0;


        while (true) {
            int number = Integer.parseInt(reader.readLine());
            if (number == -1)
            break;
            a = (a + number);
            n++;
        }
        double arithmeticMean = a / n;
        System.out.println(arithmeticMean);

    }
}

