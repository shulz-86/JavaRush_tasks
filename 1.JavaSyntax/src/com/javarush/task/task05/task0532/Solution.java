package com.javarush.task.task05.task0532;
/* 
Задача по алгоритмам
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;

        int n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            for (int i = 0; i < n; i++) {

                int num = Integer.parseInt(reader.readLine());
                if (maximum < num) {
                    maximum = num;
                }
            }
            System.out.println(maximum);
        }


    }
}
