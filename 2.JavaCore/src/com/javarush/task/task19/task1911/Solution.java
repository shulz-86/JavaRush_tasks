package com.javarush.task.task19.task1911;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Ридер обертка
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        //запоминаем настоящий PrintStream в спец. переменную, дабы потом вернуть его в изначальном виде.
        PrintStream consoleStream = System.out;

        // создаем ссылку на поток в виде динамического массив байтов
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        //создаем адаптер к классу PrintStream - ссылку на свой поток из ранее объявленного динамического массива байтов
        PrintStream myStream = new PrintStream(outputStream);

        //Устанавливаем свой поток/адаптер как текущее значение System.out
        System.setOut(myStream);

        //Вызываем функцию, которая по умолчанию выводит в консоль текст "it's a text for testing", но!
        // PrintStream подменен нами на этом этапе выполнения программы на свой адаптер - массив байтов.
        testString.printSomething();

        //переводим в "обертке" result все буквы в заглавные из подмененного нами PrintStream, в котором на данный
        // момент валяется без дела строка "it's a text for testing" из printSomething() в виде массива байтов
        String result = outputStream.toString().toUpperCase();

        // возвращаем переменной setOut исходное значение
        System.setOut(consoleStream);

        // в итоге строка выводится в upperCase, согласно нашей обертке
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
