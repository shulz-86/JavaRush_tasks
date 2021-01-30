package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        int count = 0;
        BufferedReader fileReader = new BufferedReader (new FileReader(fileName));
        while (fileReader.ready()) {
            String[] wordsInLine = fileReader.readLine().split("\\W");
            for (int i = 0; i < wordsInLine.length; i++) {
                if (wordsInLine[i].equals("world"))
                    count++;
            }
        }
        fileReader.close();
        System.out.println(count);
    }
}
