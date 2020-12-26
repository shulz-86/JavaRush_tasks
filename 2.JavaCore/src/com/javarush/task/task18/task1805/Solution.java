package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine()); //Вводим с консоли имя файла

        TreeSet<Integer> set = new TreeSet<Integer>(); // тут создаем самосортирующийся TreeSet

        while (inputStream.available() > 0) { //пока в файле что-то есть
            set.add(inputStream.read());  // читаем, заполняем set
        }
        inputStream.close(); //закрываем поток ввода

        for (int i : set){ // и выводим наш TreeSet отсортированный через пробел в одну строку
            System.out.print(i + " ");
        }
    }
}
