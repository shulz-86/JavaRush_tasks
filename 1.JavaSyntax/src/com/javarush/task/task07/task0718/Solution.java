package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++) {
            if (i + 1 < list.size() && list.get(i).length() > list.get(i + 1).length()) {
                System.out.println(list.indexOf(list.get(i + 1)));
                break;
            }
        }

    }
}

