package com.javarush.task.task08.task0827;

/* 
Работа с датой
*/

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Calendar calendar1 = new GregorianCalendar();
        calendar1.setTime(new Date(date));
        return calendar1.get(Calendar.DAY_OF_YEAR) % 2 != 0;
    }
}
