package com.javarush.task.task18.task1801;

import java.io.*;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        int maxByte = 0;

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data > maxByte)
                maxByte= data;
        }

        inputStream.close();
        System.out.println(maxByte);
    }
}
