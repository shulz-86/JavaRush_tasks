package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        String s = "S";
        int n = 0;
        int i = 0;
        while (n < 10) {
            while (i < 10) {
                System.out.print(s);
                i++;
            }
            i = 0;
            System.out.println();
            n++;
        }

    }
}
