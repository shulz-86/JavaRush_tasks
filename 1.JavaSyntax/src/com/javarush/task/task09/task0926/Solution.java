package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> arr = new ArrayList<>();
        int[] a = {1, 5, 4, 8, 32};
        int[] b = {95, 54};
        int[] c = {15, 54, 47, 83};
        int[] d = {19, 571, 7, 84, 3, 46, 478};
        int[] e = {};
        arr.add(a);
        arr.add(b);
        arr.add(c);
        arr.add(d);
        arr.add(e);

        return arr;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
