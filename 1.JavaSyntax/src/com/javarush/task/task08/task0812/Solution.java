package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        ArrayList<Integer> listX = new ArrayList<>();
        int x = 1;
        for (int i = 0; i < list.size(); i++) {
            if (i + 1 < list.size() && list.get(i).equals(list.get(i + 1))) {
                x++;
                listX.add(x);
            } else {
                x = 1;
            }
        }
        int max = 1;
        for (int i = 0; i < listX.size(); i++) {
            if (listX.get(i) > max) {
                max = listX.get(i);
            }
        }
        System.out.println(max);
    }
}