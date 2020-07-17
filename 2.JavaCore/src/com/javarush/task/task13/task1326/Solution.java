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
            FileInputStream inStream = new FileInputStream(reader.readLine());
            BufferedInputStream fileReader = new BufferedInputStream(inStream);
            //BufferedReader fileReader = new BufferedReader(new InputStreamReader(inStream));

            //C:\Users\Анастасия\Desktop\тестJAVA.txt
            ArrayList<Integer> list = new ArrayList<>();

            while (fileReader.available() > 0) {

                list.add(Integer.parseInt(String.valueOf(fileReader)));
            }
            //System.out.println(list);

            fileReader.close();
            reader.close();
            inStream.close();

            Collections.sort(list);

            for (Integer num : list) {
                if (num % 2 == 0) {
                    System.out.println(num);
                }
            }
        }
        catch (NumberFormatException en) {
            System.out.println("тык тык тык");
        }
        catch (IOException e) {
            System.out.println("пык пык пык");
        }

        /*String line = fileReader.readLine().substring(1);
        while (line != null) {
            list.add(Integer.parseInt(line));
            line = fileReader.readLine();
        }*/

    }
}
