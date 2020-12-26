package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = fileNameReader.readLine();
        String fileName2 = fileNameReader.readLine();

        FileInputStream inputStream1 = new FileInputStream(fileName1);
        FileInputStream inputStream2 = new FileInputStream(fileName2);

        byte[] buffer1 = new byte[inputStream1.available()];
        while (inputStream1.available() > 0) {
            inputStream1.read(buffer1);
        }
        inputStream1.close();

        byte[] buffer2 = new byte[inputStream2.available()];
        while (inputStream2.available() > 0) {
            inputStream2.read(buffer2);
        }
        inputStream2.close();

        FileOutputStream outputStream = new FileOutputStream(fileName1);
        outputStream.write(buffer2);
        outputStream.write(buffer1);
        outputStream.close();

    }
}
