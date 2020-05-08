package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }

            list.add(family);
        }

        String city = reader.readLine(); // Считываем название города, записываем в переменную city
        int familyNameIndex = list.indexOf(city) + 1; // Находим номер города в листе. Следующий номер - нужная нам семья
        System.out.println(list.get(familyNameIndex));

        /*Map<String, String> map = new HashMap<>();
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            for (String s : list) {
                map.put(city, s);
            }

        }
        if (city.equals(s.getKey())) {
            System.out.println(s.getValue());
        }*/


        // Read the house number
        /*int houseNumber = Integer.parseInt(reader.readLine());

        if (0 <= houseNumber && houseNumber < list.size()) {
            String familyName = list.get(houseNumber);
            System.out.println(familyName);
        }*/
    }
}
