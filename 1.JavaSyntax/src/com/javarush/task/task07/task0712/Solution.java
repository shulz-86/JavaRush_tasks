package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/* 
Самые-самые
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
            if (list.get(i).length() < min) {
                min = list.get(i).length();
            }
            if (list.get(i).length() > max) {
                max = list.get(i).length();
            }
        }
        for (int i = 0; i < 10; i++) {
            if (min == list.get(i).length()) {
                System.out.println(list.get(i));
                break;
            } else if (max == list.get(i).length()) {
                System.out.println(list.get(i));
                break;
            }
        }

    }
}
