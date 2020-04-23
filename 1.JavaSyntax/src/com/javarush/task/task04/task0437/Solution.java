package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {
        for (int a = 1; a < 11; a++) { // столбец
            for (int i = 11 - a; i < 11; i++) { //строка
                System.out.print("8");
            }
            System.out.println();
        }

    }
}
