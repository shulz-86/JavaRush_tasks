package com.javarush.task.task19.task1921;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]))) {
            while (fileReader.ready()) {
                String line = fileReader.readLine();
                String name = line.replaceAll("\\d", " ").trim();
                String date = line.replaceAll("\\D", " ").trim();

                SimpleDateFormat format = new SimpleDateFormat("d M yyyy");

                PEOPLE.add(new Person(name, format.parse(date)));
            }
        }
    }
}
