package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        InputStream inStream = new FileInputStream(reader.readLine());
        BufferedInputStream buffer = new BufferedInputStream(inStream);

        while (buffer.available() > 0) { // тут наверно надо поменять
            System.out.print((char)(buffer.read()));
        }

        inStream.close();
        buffer.close();
        reader.close();

    }
}