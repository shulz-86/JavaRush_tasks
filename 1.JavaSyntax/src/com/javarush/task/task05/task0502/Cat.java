package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {}

    public Cat(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat) {
        int cat1Score = 0;
        int cat2Score = 0;

        if (this.age > anotherCat.age) {
            cat1Score++;
        } else if (this.age < anotherCat.age) {
            cat2Score++;
        }

        if (this.weight > anotherCat.weight) {
            cat1Score++;
        } else if (this.weight < anotherCat.weight) {
            cat2Score++;
        }

        if (this.strength > anotherCat.strength) {
            cat1Score++;
        } else if (this.strength < anotherCat.strength) {
            cat2Score++;
        }

        return cat1Score >= cat2Score;

    }

    public static void main(String[] args) {
        Cat cat1 = new Cat(6, 6, 25);
        Cat cat2 = new Cat(5, 8, 28);
        System.out.println(cat1.fight(cat2));
    }
}
