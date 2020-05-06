package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/* 
Играем в Jолушку
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();   //главный
        ArrayList<Integer> odd = new ArrayList<Integer>();    //нечётные
        ArrayList<Integer> even = new ArrayList<Integer>();   //чётные
        ArrayList<Integer> rest = new ArrayList<Integer>();   //остальные

        for (int i = 0; i < 20; i++) {
            int s = Integer.parseInt(reader.readLine());
            list.add(s);
        }

        for (Integer x : list) {
            if (x % 3 == 0) {
                odd.add(x);
            }
            if (x % 2 == 0) {
                even.add(x);
            }
            if (x % 2 != 0 && x % 3 != 0) {
                rest.add(x);
            }
        }
        printList(odd);
        printList(even);
        printList(rest);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer element: list) {
            System.out.println(element);
        }
    }
}
