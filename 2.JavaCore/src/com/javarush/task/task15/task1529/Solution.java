package com.javarush.task.task15.task1529;

/* 
Осваивание статического блока
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            if(s.equals("helicopter")) {
                result = new Helicopter();
            }
            if(s.equals("plane")) {
                result = new Plane(5);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("ойёёёй!");
        }

    }
}
