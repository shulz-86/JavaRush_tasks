package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();

        BufferedWriter writter = new BufferedWriter(new FileWriter(fileName));



        while (true) {
            String dataName = reader.readLine();
            writter.write(dataName + "\n");

            if (dataName.equals("exit")) {
                break;
            }
        }

        reader.close();
        writter.close();
    }
}
