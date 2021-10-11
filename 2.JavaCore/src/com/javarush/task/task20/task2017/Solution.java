package com.javarush.task.task20.task2017;

import java.io.*;

/* 
Десериализация
*/

public class Solution {
    public A getOriginalObject(ObjectInputStream objectStream) {
        try {
            return (A) objectStream.readObject();
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, при попытке десериализации возникло исключение или не был получен объект типа A");
            return null;
        }
    }

    public class A implements Serializable {

        public A() {
        }
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Balda.out"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Balda.out"));

        out.close();
        ois.close();
    }
}
