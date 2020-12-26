package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine()); //Вводим с консоли имя файла

        LinkedList<Integer> bytes = new LinkedList<>();
        while (inputStream.available() > 0) { //пока в файле что-то есть
            int myByte = inputStream.read();  // читаем
            bytes.add(myByte);  // заполняем список байт
        }
        inputStream.close(); //закрываем поток ввода

        Map<Integer, Integer> repeats = new HashMap<>();
        for(int b : bytes) { // перебираем список байт
            Integer count = 0; // чтобы найти повторы, устанавливаем счетчик
            for(int c : bytes) { // перебираем повторно и сравниваем с предыдущим знаением байта из списка
                if (b == c) { // и если повтор обнаружен,
                    count++; // плюсуй счетчик
                }
            }
            repeats.put(b, count); // список разок перебрали, занесем в мапу (ключ - байт, значение - кол-во повторов)
        }                          // и снова переберем список

        Integer min = Collections.min(repeats.values()); // нашли миниимальное количество повторов
        // перебираем мапу, чтобы найти, один или несколько максимальных повторов
        for (Map.Entry <Integer, Integer> repeat : repeats.entrySet()) {
            if (repeat.getValue().equals(min)) { // и если имеются значения, равные максимальному, выводи на экран
                System.out.print(repeat.getKey() + " "); // просто принт (не принтлн) + пробел
            }
        }
    }
}
