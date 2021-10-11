package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        String reversedString;
        String line;

        while ((line = fileReader.readLine()) != null) {
            reversedString = new StringBuilder(line).reverse().toString();
            System.out.println(reversedString);
        }

        reader.close();
        fileReader.close();


    }
}
