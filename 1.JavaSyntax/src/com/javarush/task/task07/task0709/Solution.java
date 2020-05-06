package com.javarush.task.task07.task0709;
/* 
Выражаемся покороче
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
            if (list.get(i).length() < min) {
                min = list.get(i).length();
            }
        }
        for (int i = 0; i < 5; i++) {
            if (min == list.get(i).length())
            System.out.println(list.get(i));
        }

    }
}
