package com.javarush.task.task06.task0614;
/* 
Статические коты
*/
import java.util.ArrayList;

public class Cat {

    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public Cat() {
    }

    public static void main(String[] args) {
        for (int a = 0; a < 10; a++) {
            cats.add(new Cat());
        }
        printCats();
    }

    public static void printCats() {
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }
    }
}
