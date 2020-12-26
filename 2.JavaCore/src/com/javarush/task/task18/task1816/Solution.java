package com.javarush.task.task18.task1816;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        int count = 0;
        while (fis.available() > 0) {
            int myByte = fis.read();
            if ((myByte >= 'a' && myByte <= 'z') || (myByte >= 'A' && myByte <= 'Z')) {
                count++;
            }
        }
        fis.close();
        System.out.println(count);
    }

}
