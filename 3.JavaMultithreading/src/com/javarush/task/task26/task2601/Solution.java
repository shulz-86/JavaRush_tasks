package com.javarush.task.task26.task2601;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/* 
Почитать в инете про медиану выборки
*/

public class Solution {

    public static void main(String[] args) {
//        System.out.println(Arrays.asList(sort(new Integer[]{13, 8, 15, 5, 17})));
//        System.out.println("----------------------------------------------");
//        System.out.println(Arrays.asList(sort(new Integer[]{13, 8, 15, 5, 17, 11})));
//        System.out.println("----------------------------------------------");
//        System.out.println(Arrays.asList(sort(new Integer[]{1,2,3,3,3,4,5})));
//        System.out.println("----------------------------------------------");
//        System.out.println(Arrays.asList(sort(new Integer[]{1,2,4,4,4,5})));
//        System.out.println("----------------------------------------------");
//        //System.out.println(Arrays.asList(sort(new Integer[]{})));
//        System.out.println("----------------------------------------------");
//        System.out.println(Arrays.asList(sort(new Integer[]{0})));
    }

    public static Integer[] sort(Integer[] array) {
        //implement logic here
        final double mediana = getMediana(array);
        Arrays.sort(array, new  Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                double v1 = o1.intValue() - mediana;
                double v2 = o2.intValue() - mediana;
                return (int) ((v1 * v1 - v2 * v2) * 100);
            }
        });
        
        return array;
    }

    private static double getMediana(Integer[] array) {
        Arrays.sort(array);
        double result;
        if (array.length % 2 == 1) {
            result = array[array.length / 2];
        } else {
            result = (array[array.length / 2 - 1] + array[array.length / 2]) / 2.;
        }
        return result;
    }
}
