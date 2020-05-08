package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Петров", dateFormat.parse("JUNE 1 2013"));
        map.put("Сидоров", dateFormat.parse("MAY 31 1985"));
        map.put("Булкин", dateFormat.parse("JANUARY 14 2001"));
        map.put("Иванов", dateFormat.parse("DECEMBER 15 2002"));
        map.put("Светличный", dateFormat.parse("FEBRUARY 28 2016"));
        map.put("Котов", dateFormat.parse("MARCH 17 2009"));
        map.put("Васечкин", dateFormat.parse("APRIL 5 2020"));
        map.put("Бобриков", dateFormat.parse("JULY 19 2018"));
        map.put("Филатов", dateFormat.parse("DECEMBER 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> n = iterator.next();
            Calendar calendar1 = new GregorianCalendar();
            calendar1.setTime(n.getValue());

            if (calendar1.get(Calendar.MONTH) == Calendar.JUNE ||
                    calendar1.get(Calendar.MONTH) == Calendar.JULY ||
                    calendar1.get(Calendar.MONTH) == Calendar.AUGUST) {
                iterator.remove();

            }
        }

    }

    public static void main(String[] args) {

    }
}
