package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(2.0d, "цента");
        labels.put(3.0d, "цента");
        labels.put(4.0d, "рубля");
        labels.put(6.0d, "рублей");
        labels.put(10.0d, "долларов");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
