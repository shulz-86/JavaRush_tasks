package com.javarush.task.task07.task0724;
/* 
Семейная перепись
*/
public class Solution {
    public static void main(String[] args) {
       Human grossFather1 = new Human("Алексей", true, 65);
       Human grossFather2 = new Human("Анатолий", true, 70);
       Human grossMather1 = new Human("Антонина", false, 63);
       Human grossMather2 = new Human("Анастасия", false, 86);
       Human father = new Human("Олег", true, 60, grossFather1, grossMather1);
       Human mather = new Human("Татьяна", false, 60, grossFather2, grossMather2);
       Human child1 = new Human("Костя", true, 5, father, mather);
       Human child2 = new Human("Олежа", true, 8, father, mather);
       Human child3 = new Human("Лера", false, 3, father, mather);

        System.out.println(grossFather1.toString());
        System.out.println(grossFather2.toString());
        System.out.println(grossMather1.toString());
        System.out.println(grossMather2.toString());
        System.out.println(father.toString());
        System.out.println(mather.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}