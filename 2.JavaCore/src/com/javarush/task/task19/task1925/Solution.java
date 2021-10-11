package com.javarush.task.task19.task1925;


import java.io.*;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        FileWriter fileWriter = new FileWriter(args[1]);
        StringBuilder stringBuilder = new StringBuilder();
        while (fileReader.ready()) {
            String[] line = fileReader.readLine().split("\\s");

            for (String str : line) {
                if (str.length() > 6) {
                    stringBuilder.append(str);
                    stringBuilder.append(",");
                }
            }
        }
        fileWriter.write(stringBuilder.substring(0, stringBuilder.length() - 1));

        fileReader.close();
        fileWriter.close();
    }
}
