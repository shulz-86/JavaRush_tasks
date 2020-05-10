package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

import java.io.IOException;

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (Throwable exception) {
            exception.printStackTrace();
        }
    }

    public static void divideByZero() {
            int a = 45 / 0;
            System.out.println(a);

    }
}
