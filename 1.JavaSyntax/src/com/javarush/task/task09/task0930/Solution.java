package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам Ӏ Java Syntax: 9 уровень, 11 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                if (isNumber(array[i])) {
                    int nextIndex = -1;
                    for (int s = i+1; s < array.length; s++) {
                        if (isNumber(array[s])) {
                            nextIndex = s;
                            break;
                        }
                    }
                    if (nextIndex > -1 && Integer.parseInt(array[i]) < Integer.parseInt(array[nextIndex])) {
                        int num = Integer.parseInt(array[i]);
                        array[i] = array[nextIndex];
                        array[nextIndex] = String.valueOf(num);
                    }
                } else if (!isNumber(array[i])) {
                    int nextIndex = -1;
                    for (int s = i+1; s < array.length; s++) {
                        if (!isNumber(array[s])) {
                            nextIndex = s;
                            break;
                        }
                    }
                    if (nextIndex > -1 && isGreaterThan(array[i], array[nextIndex])) {
                        String s = array[i];
                        array[i] = array[nextIndex];
                        array[nextIndex] = s;
                    }
                }
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
