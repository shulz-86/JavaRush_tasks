package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName1);
        FileOutputStream outputStream1 = new FileOutputStream(fileName2);
        FileOutputStream outputStream2 = new FileOutputStream(fileName3);

        byte[] buffer = new byte[inputStream.available()];
        int count = inputStream.read(buffer);
        if(buffer.length %2 != 0) {
            outputStream1.write(buffer, 0, count/2 + 1);
            outputStream2.write(buffer, count/2 + 1, count/2);

        } else {
            outputStream1.write(buffer, 0, count/2);
            outputStream2.write(buffer, count/2, count/2);
        }

        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
