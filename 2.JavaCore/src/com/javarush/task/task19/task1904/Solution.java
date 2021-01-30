package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner fileScanner;

        PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException { //читать строку с файла, парсить её,
            // и возвращать данные только одного человека, в виде объекта класса Person.
            // считываем строку сканером в массив строк разделенный на 4 части пробелом
            String[] pers = fileScanner.nextLine().split(" ", 4);
            SimpleDateFormat dateFormat = new SimpleDateFormat("d M y", Locale.ENGLISH);
            String d = pers[3];
            String first = pers[1];
            String middleName = pers[2];
            String lastName = pers [0];
            Date date = dateFormat.parse(d);
            return new Person(first, middleName, lastName, date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
