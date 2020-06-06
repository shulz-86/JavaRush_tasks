package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arrayLists = new ArrayList[3];
        arrayLists[0] = new ArrayList(Arrays.asList("Привет!", "Меня зовут Настя."));
        arrayLists[1] = new ArrayList(Arrays.asList("Сделать зарядку", "Помыть посуду"));
        arrayLists[2] = new ArrayList(Arrays.asList("Купить молоко", "Купить хлеб"));
        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}