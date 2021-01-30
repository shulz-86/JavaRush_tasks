package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();

        //запоминаем настоящий PrintStream в спец. переменную
        PrintStream consoleStream = System.out;

        // создаем ссылку на поток в виде динамического массива байтов
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        //создаем адаптер к классу PrintStream - ссылку на свой поток из ранее объявленного динамического массива байтов
        PrintStream myStream = new PrintStream(outputStream);

        //Устанавливаем свой поток/адаптер как текущее значение System.out
        System.setOut(myStream);

        //Вызываем функцию, которая по умолчанию выводит в консоль текст "it's a text for testing", но!
        // PrintStream подменен нами на этом этапе выполнения программы на свой адаптер - массив байтов.
        testString.printSomething();

        String result = outputStream.toString();

        // возвращаем переменной setOut исходное значение
        System.setOut(consoleStream);

        FileOutputStream fis = new FileOutputStream(filename);
        fis.write(outputStream.toByteArray());
        fis.close();

        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

