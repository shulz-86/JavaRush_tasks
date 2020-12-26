package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = fileNameReader.readLine();
        String fileName2 = fileNameReader.readLine();


        try(BufferedReader reader1 = new BufferedReader(new FileReader(fileName1));
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))) {
            String[] nums = reader1.readLine().split(" ");
            try {
                for (String num : nums) {
                    writer.write(Math.round(Double.parseDouble(num)) + " ");
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
