package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        return (a + b);
    }

    public static int minus(int a, int b) {
        return (a - b);
    }

    public static int multiply(int a, int b) {
        return (a * b);
    }

    public static double division(int a, int b) {
        return (double)a / b;
    }

    public static double percent(int a, int b) {
        return (double) a / 100 * b;
    }

    public static void main(String[] args) {
        System.out.println(plus(5, 2));
        System.out.println(minus(6, 4));
        System.out.println(multiply(2, 9));
        System.out.println(division(9, 2));
        System.out.println(percent(65, 20));
    }
}