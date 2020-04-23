package com.javarush.task.task04.task0413;

/* 
День недели
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        if (x == 1) {
            System.out.println("понедельник");
        }
        if (x == 2) {
            System.out.println("вторник");
        }
        if (x == 3) {
            System.out.println("среда");
        }
        if (x == 4) {
            System.out.println("четверг");
        }
        if (x == 5) {
            System.out.println("пятница");
        }
        if (x == 6) {
            System.out.println("суббота");
        }
        if (x == 7) {
            System.out.println("воскресенье");
        }
        if (x < 1) {
            System.out.println("такого дня недели не существует");
        }
        if (x > 7) {
            System.out.println("такого дня недели не существует");
        }

    }
}