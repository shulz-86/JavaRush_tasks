package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.*;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        while (!fileName.equals("exit")) {
            new ReadThread(fileName).start();
            fileName = reader.readLine();
        }
        //resultMap.entrySet().forEach(System.out::println);
    }

    public static class ReadThread extends Thread {
        private String fileName = null;

        public ReadThread(String fileName) throws FileNotFoundException {
            //implement constructor body
            this.fileName = fileName;
        }

        // implement file reading here - реализуйте чтение из файла тут
        public void run() {
            List<Integer> bytes = new LinkedList<>();
            FileInputStream fis;

            try {

                fis = new FileInputStream(fileName);

                while (fis.available() > 0) {
                    bytes.add(fis.read());
                }

                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Map<Integer, Integer> repeats = new HashMap<>();
            for (int b : bytes) { // перебираем список байт
                int count = 0; // чтобы найти повторы, устанавливаем счетчик
                for (int c : bytes) { // перебираем повторно и сравниваем с предыдущим знаением байта из списка
                    if (b == c) { // и если повтор обнаружен,
                        count++; // плюсуй счетчик
                    }
                }
                repeats.put(count, b);
            }

            Integer max = Collections.max(repeats.keySet());
            

            resultMap.put(fileName, repeats.get(max));


        }

    }
}
