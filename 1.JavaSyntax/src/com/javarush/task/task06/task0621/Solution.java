package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* 
Родственные связи кошек
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grossFatherName = reader.readLine();
        Cat catGrossFather = new Cat(grossFatherName);

        String grossMotherName = reader.readLine();
        Cat catGrossMother = new Cat(grossMotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrossFather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrossMother, null);

        String sinName = reader.readLine();
        Cat catSin = new Cat(sinName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrossFather);
        System.out.println(catGrossMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSin);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parentP;
        private Cat parentM;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parentM, Cat parentP) {
            this.name = name;
            this.parentP = parentP;
            this.parentM = parentM;
        }

        @Override
        public String toString() {

            String father = parentP == null ? "no father" : "father is " + parentP.name;
            String mother = parentM == null ? "no mother" : "mother is " + parentM.name;
            return "The cat's name is " + name + ", " + mother + ", " + father;
            /*
            if (parentM == null && parentP == null) {
                return "The cat's name is " + name + ", no mother, no father";
            }
            else if (parentP == null) {
                return "The cat's name is " + name + ", mother is " + parentM.name + ", no father";
            }
            else if (parentM == null) {
                return "The cat's name is " + name + ", no mother, father is " + parentP.name;
            }
            else return "The cat's name is " + name + ", mother is " + parentM.name + ", father is " + parentP.name;*/
        }
    }

}
