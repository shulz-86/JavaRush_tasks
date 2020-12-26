package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName1);
        FileOutputStream outputStream = new FileOutputStream(fileName2);

        byte[] buffer = new byte[inputStream.available()];

        for (int i = buffer.length - 1; i >= 0; i--) {
            int count = inputStream.read(buffer);
            outputStream.write(buffer[i]);
        }
        inputStream.close();
        outputStream.close();
    }
}
