package com.javarush.task.task06.task0614;
/* 
Статические коты
*/
import java.util.ArrayList;
import java.util.List;

public class Cat {
    String name = "";
    public String toString() {
        return name;
    }
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {

    }

    public static void main(String[] args) {
        cats.add(new Cat());
        
        printCats();
    }

    public static void printCats() {
        for (int i = 0; i < 10; i++) {
            System.out.println(cats.get(i));
        }

    }
}
