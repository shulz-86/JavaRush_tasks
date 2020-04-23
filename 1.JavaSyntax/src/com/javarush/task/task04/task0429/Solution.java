package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        System.out.println("количество отрицательных чисел: " + getNegative(a, b, c));
        System.out.println("количество положительных чисел: " + getPositive(a, b, c));
    }

    private static long getPositive(int... numbers) {
        return Arrays.stream(numbers).filter(f -> f > 0).count();
    }

    private static long getNegative(int... numbers) {
        return Arrays.stream(numbers).filter(f -> f < 0).count();
    }
}
