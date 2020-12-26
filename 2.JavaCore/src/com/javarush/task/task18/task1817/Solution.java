package com.javarush.task.task18.task1817;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        int count = 0;
        int spacing = 0;
        while (fis.available() > 0) {
            int myByte = fis.read();
            count++;
            if (myByte == (' ')) {
                spacing++;
            }
        }

        fis.close();
        System.out.format("%.2f", (double) spacing / (double) count *100.0);

    }
}
