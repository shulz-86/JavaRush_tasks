package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int count = 0;
        while (inputStream.available() > 0) {
            int data = (byte) inputStream.read();
            if (data == (byte) (',')){
                count++;
            }
        }
        inputStream.close();
        System.out.println(count);
    }
}
