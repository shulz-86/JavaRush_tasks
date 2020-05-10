package com.javarush.task.task09.task0921;

/* 
Метод в try..catch
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        try {
            while (true) {
                int num = Integer.parseInt(reader.readLine());
                list.add(num);
            }
        } catch (NumberFormatException | IOException exception) {
            for (Integer integer : list) {
                System.out.println(integer);
            }
        }

    }
}
