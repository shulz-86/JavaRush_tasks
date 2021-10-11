package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        //напишите тут ваш код

        if (url.contains("?")) {
            String[] a = url.split("\\?");
            String[] b = a[1].split("&");
            ArrayList<String> str= new ArrayList<>();
            for (String s : b) {
                str.add(s.split("=")[0]);
            }
            for(String f : str) {
                System.out.print(f + " ");
            }
            System.out.println();


            if (str.contains("obj")) {
                for (int i = 0; i < b.length-1; i++) {
                    String result = b[i].split("=")[1];
                    try {
                        alert(Double.parseDouble(result));
                    } catch (NumberFormatException nfe) {
                        alert(result);
                    }
                }
            }
            else {
                //System.out.println("URL не содержит obj");
            }
        } else {
            //System.out.println("URL не содержит знак ?");
        }

        reader.close();
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
