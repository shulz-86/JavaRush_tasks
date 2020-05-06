package com.javarush.task.task07.task0705;
/* 
Один большой массив и два маленьких
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        int[] num1 = new int[10];
        for (int i = 0; i < num1.length; i++) {
            num1[0] = numbers[0];
            num1[1] = numbers[1];
            num1[2] = numbers[2];
            num1[3] = numbers[3];
            num1[4] = numbers[4];
            num1[5] = numbers[5];
            num1[6] = numbers[6];
            num1[7] = numbers[7];
            num1[8] = numbers[8];
            num1[9] = numbers[9];
        }

        int[] num2 = new int[10];
            num2[0] = numbers[10];
            num2[1] = numbers[11];
            num2[2] = numbers[12];
            num2[3] = numbers[13];
            num2[4] = numbers[14];
            num2[5] = numbers[15];
            num2[6] = numbers[16];
            num2[7] = numbers[17];
            num2[8] = numbers[18];
            num2[9] = numbers[19];

        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]);

        }


    }
}
