package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* 
Множество всех животных
*/
public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> resultCat = new HashSet<Cat>();
        resultCat.add(new Cat());
        resultCat.add(new Cat());
        resultCat.add(new Cat());
        resultCat.add(new Cat());

        return resultCat;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> resultDog = new HashSet<Dog>();
        resultDog.add(new Dog());
        resultDog.add(new Dog());
        resultDog.add(new Dog());

        return resultDog;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        for (Cat cat : cats) {
            pets.remove(cat);
        }
    }

    public static void printPets(Set<Object> pets) {
        pets.forEach(System.out::println);
    }

    public static class Cat {
        public Cat() {}
    }
    public static class Dog {
        public Dog() {}
    }
}
