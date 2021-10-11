package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
            ArrayList<Integer> list = new ArrayList<>();

            while (fileReader.ready()) {
                int i = Integer.parseInt(String.valueOf(fileReader.readLine()));
                if (i % 2 == 0)
                    list.add(i);
            }
            Collections.sort(list);
            for (Integer i : list) {
                System.out.println(i);
            }

            fileReader.close();
            reader.close();
        }
        catch (NumberFormatException en) {
            System.out.println("тык тык тык");
        }
        catch (IOException e) {
            System.out.println("пык пык пык");
        }
    }
}
