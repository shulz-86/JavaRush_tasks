package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {
    public static void main(String[] args) {

    }
    public static int min(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }
    public static long min(long l, long m) {
        if (l > m) {
            return m;
        } else {
            return l;
        }
    }
    public static double min(double d, double c) {
        if (d > c) {
            return c;
        } else {
            return d;
        }
    }
}
