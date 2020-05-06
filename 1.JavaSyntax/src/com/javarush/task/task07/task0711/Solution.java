package com.javarush.task.task07.task0711;
/* 
Удалить и вставить
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        for (int j = 0; j < 13; j++) {
            list.add(0, list.remove(4));
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

    }
}
