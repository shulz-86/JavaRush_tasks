package com.javarush.task.task18.task1822;

import java.io.*;

/* 
Поиск данных внутри файла
C:\Users\Анастасия\Desktop\тестJAVA.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        try (BufferedReader fis = new BufferedReader(new FileReader(filename))) {
            String s = "";
            while ((s = fis.readLine()) != null) {
                if (s.startsWith(args[0] + " ")) {
                    System.out.println(s);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
