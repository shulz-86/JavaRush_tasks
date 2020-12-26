package com.javarush.task.task18.task1821;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream(args[0])) {
            int[] frequency = new int[256];
            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                frequency[data]++;
            }
            for (int i = 0; i < frequency.length; i++) {
                if (frequency[i] != 0) {
                    System.out.println(((char) i) + " " + frequency[i]);
                }
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
