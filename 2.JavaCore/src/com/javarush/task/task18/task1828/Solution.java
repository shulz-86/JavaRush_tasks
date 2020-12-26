package com.javarush.task.task18.task1828;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы 2
*/

public class Solution {
    public static List<String> priseList = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        //считываем имя файла
        String fileName = getFileNameFromConsole();

        if (args.length != 0) {
            // читаем файл построчно в ArrayList
            BufferedReader readerFile = new BufferedReader(new FileReader(fileName));
            String line = readerFile.readLine();
            while (line != null) {
                priseList.add(line);
                line = readerFile.readLine();
            }
            readerFile.close();

            switch (args[0]) {
                case "-u":  //обновляет данные товара с заданным id
                    update(args[1],args[2],args[3],args[4]);
                    writeListToFile(fileName);
                    break;

                case "-d": //производит физич. удаление товара с заданным id (все данные, которые относятся к переданному id)
                    delete(args[1]);
                    writeListToFile(fileName);
                    break;
            }
        }
    }
    private static void update(String id, String productName, String price, String quantity) throws IOException {
        for (int i = 0; i < priseList.size(); i++) {
            String line = priseList.get(i);
            if (getId(line).equalsIgnoreCase(id)) {
                String record = String.format("%-8s%-30.30s%-8.8s%-4.4s", id, productName, price, quantity);
                priseList.set(i, record);
            }
        }
    }

    private static void writeListToFile(String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        for (String s : priseList) {
            writer.append(s);
            writer.newLine();
        }

        writer.close();
    }

    private static String getId(String line) {
        return line.substring(0, 8).trim();
        //.replaceAll(" ", "")
    }

    private static void delete(String id) {
        for (int i = 0; i < priseList.size(); i++) {
            String line = priseList.get(i);
            if (getId(line).equalsIgnoreCase(id)) {
               priseList.remove(line);
            }
        }
    }

    private static String getFileNameFromConsole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
}
