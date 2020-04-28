package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 5; i > 0; i--) {
            result.append(s);
        }
        return result.toString();
    }

    public static String multiply(String s, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(s);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("ПАМАГИТИ", 6));
        System.out.println(multiply("sss"));
    }
}
