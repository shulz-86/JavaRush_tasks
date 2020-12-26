package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileOutputStream outputStream = new FileOutputStream(fileName1, true);
        FileInputStream inputStream = new FileInputStream(fileName2);
        FileInputStream inputStream2 = new FileInputStream(fileName3);

        byte[] buffer = new byte[inputStream.available()];
        while (inputStream.available() > 0) {
            inputStream.read(buffer);
            outputStream.write(buffer);
        }
        byte[] buffer2 = new byte[inputStream2.available()];
        while (inputStream2.available() > 0) {
            inputStream2.read(buffer2);
            outputStream.write(buffer2);
        }
        outputStream.close();
        inputStream.close();
        inputStream2.close();
    }
}
