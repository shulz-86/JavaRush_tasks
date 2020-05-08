package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        Human children1 = new Human("Аня", false, 5);
        Human children2 = new Human("Вася", true, 8);
        Human children3 = new Human("Петя", true, 12);

        Human father = new Human("Гриша", true, 29, new ArrayList<Human>
                (Arrays.asList(children1,children2, children3)));
        Human mother = new Human("Настя", false, 33, new ArrayList<Human>
                (Arrays.asList(children1,children2, children3)));
        Human grandfather1 = new Human("Вова", true, 72, new ArrayList<Human>
                (Arrays.asList(father)));
        Human grandfather2 = new Human("Толя", true, 63, new ArrayList<Human>
                (Arrays.asList(mother)));
        Human grandmother1 = new Human("Валя", false, 70, new ArrayList<Human>
                (Arrays.asList(father)));
        Human grandmother2 = new Human("Таня", false, 60, new ArrayList<Human>
                (Arrays.asList(mother)));

        System.out.println(grandmother2.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandfather1.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(children1.toString());
        System.out.println(children2.toString());
        System.out.println(children3.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human (String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
