package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        FileWriter fileWriter = new FileWriter(args[1]);

        while (reader.ready()) {
            String[] s = reader.readLine().split(" ");
            for (String w : s) {
                if (w.matches(".*[0-9].*")){
                    fileWriter.write(w + " ");
                }
            }
        }
        reader.close();
        fileWriter.close();

    }
}
