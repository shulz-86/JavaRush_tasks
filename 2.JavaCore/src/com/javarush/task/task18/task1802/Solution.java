package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int minByte = inputStream.read();;
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data < minByte) {
                minByte = data;
            }
        }
        inputStream.close();
        System.out.println(minByte);
    }
}
