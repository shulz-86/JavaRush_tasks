package com.javarush.task.task09.task0920;

/* 
Обратный отсчёт
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            try {
                Thread.sleep(100);
                System.out.println(i);
            } catch (Throwable exception) {
                System.out.println("Ошибочка вышла!");
            }
        }
    }
}
