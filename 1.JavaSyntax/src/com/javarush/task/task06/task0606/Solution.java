package com.javarush.task.task06.task0606;

/* 
Чётные и нечётные циферки
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        for (int i = 0; i < number.length(); i++) {
            if (Integer.parseInt(number.substring(i, i+1)) % 2 == 0) {
                even++;
            } else  {
                odd++;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);
        //4445 % 1000
    }
}
