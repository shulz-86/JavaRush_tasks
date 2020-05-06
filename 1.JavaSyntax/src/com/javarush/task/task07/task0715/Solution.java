package com.javarush.task.task07.task0715;
/* 
Продолжаем мыть раму
*/
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        String[] mama = {"мама", "мыла", "раму"};
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, mama);

        list.add(1, "именно");
        list.add(3, "именно");
        list.add(5,"именно");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
