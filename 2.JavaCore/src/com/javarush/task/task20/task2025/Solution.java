package com.javarush.task.task20.task2025;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Алгоритмы-числа
*/

public class Solution {
    static int S;
    static String s = "" + S;
    static int M = s.length();
    static int countS;
    List<Integer> resultNumS = new ArrayList<>();

    public static List<Integer> addS (List<Integer> resultNumS){
        while(S > 0) {
            resultNumS.add(S % 10);
            S = S / 10;
        }
        Collections.reverse(resultNumS);
        System.out.println(resultNumS);
        return resultNumS;
    }

    public static long[] getNumbers(long N) {

        for (long i = 0; i < N; i++) {



            countS++;
        }
// Math.pow(a3, M) // возведение числа в степень M


        long[] result = new long[countS];
        Arrays.sort(result, 0, Integer.MAX_VALUE);
        return result;
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000000)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}
