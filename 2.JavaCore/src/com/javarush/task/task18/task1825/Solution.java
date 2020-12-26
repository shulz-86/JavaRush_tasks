package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        TreeSet<String> mySet = new TreeSet<>();
        //считываем имена файлов, пока не будет введено слово "end"
        while (!fileName.equals("end")) {
            mySet.add(fileName);
            fileName = reader.readLine();
        }
        //имя файла без суффикса [.partN]
        String someName = mySet.first().substring(0, mySet.first().lastIndexOf(".part"));
        //поток для записи в файл без суффикса [.partN]
        FileOutputStream fos = new FileOutputStream(someName);

        for (String s : mySet) {
            FileInputStream fis = new FileInputStream(s);
            byte [] buffer = new byte[fis.available()]; // используем буффер
            fis.read(buffer);
            fos.write(buffer);
            fis.close();
        }
        fos.close();

    }
}
