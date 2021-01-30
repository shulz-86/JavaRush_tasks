package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        //запоминаем настоящий PrintStream в спец. переменную
        PrintStream consoleStream = System.out;

        // создаем ссылку на поток в виде динамического массив байтов
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        //создаем адаптер к классу PrintStream - ссылку на свой поток из ранее объявленного динамического массива байтов
        PrintStream myStream = new PrintStream(outputStream);

        //Устанавливаем свой поток/адаптер как текущее значение System.out
        System.setOut(myStream);

        //Вызываем функцию, которая по умолчанию выводит в консоль текст "3 + 6 = ", но!
        // PrintStream подменен нами на этом этапе выполнения программы на свой адаптер - массив байтов.
        testString.printSomething();

        //модифицируем строку выведенную методом printSomething()
        String str = outputStream.toString().trim();/**/
        String[] elements = str.split(" "); //считываем строку в массив строк разделенных пробелом
        int a = Integer.parseInt(elements[0]);
        int b = Integer.parseInt(elements[2]);
        int result = 0;

        switch (elements[1]){
            case "+": result = a + b; break;
            case "-": result = a - b; break;
            case "*": result = a * b; break;
        }

        // возвращаем переменной setOut исходное значение
        System.setOut(consoleStream);

        // в итоге строка выводится в upperCase, согласно нашей обертке
        System.out.println(str + " " + result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

