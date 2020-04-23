package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

public class Solution {
    public static void main(String[] args) {
        int secondsIn15 = 15*3600;
        int secondsIn1530 = secondsIn15 + 30*60;
        int secondsAfter15 = secondsIn1530 - secondsIn15;
        System.out.println(secondsAfter15);
    }
}