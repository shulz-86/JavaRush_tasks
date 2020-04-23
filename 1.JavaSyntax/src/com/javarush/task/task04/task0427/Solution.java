package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        boolean m = (a > 0 && a < 1000);
        if (m && a < 10 && a%2 == 0) {
            System.out.println("четное однозначное число");
        } else if (m && a < 10 && a%2 != 0) {
            System.out.println("нечетное однозначное число");
        } else if (m && a < 100 && a >=10 && a%2 == 0) {
            System.out.println("четное двузначное число");
        } else if (m && a < 100 && a >=10 && a%2 != 0) {
            System.out.println("нечетное двузначное число");
        } else if (m && a < 1000 && a >=100 && a%2 == 0) {
            System.out.println("четное трехзначное число");
        } else if (m && a < 1000 && a >=100 && a%2 != 0) {
            System.out.println("нечетное трехзначное число");
        }


    }
}
