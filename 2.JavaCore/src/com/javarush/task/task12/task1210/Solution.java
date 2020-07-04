package com.javarush.task.task12.task1210;

/* 
Три метода и максимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int max(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }
    public static long max(long l, long m) {
        if (l < m) {
            return m;
        } else {
            return l;
        }
    }
    public static double max(double d, double c) {
        if (d < c) {
            return c;
        } else {
            return d;
        }
    }
}
