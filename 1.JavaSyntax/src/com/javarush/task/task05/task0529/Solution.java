package com.javarush.task.task05.task0529;

/* 
Консоль-копилка
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;



        while (true) {
            String s = buffer.readLine();
            if (s.equals("сумма")) {
                break;
            }
            int a = Integer.parseInt(s);
            sum = (sum + a);

        }

        System.out.println(sum);
    }
}
