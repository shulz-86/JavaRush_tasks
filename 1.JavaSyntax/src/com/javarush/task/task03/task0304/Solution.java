package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int i) {
        double p = 0.1;
        return i + i * p;

    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
