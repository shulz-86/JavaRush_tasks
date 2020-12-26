package com.javarush.task.task18.task1827;

import java.io.*;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {


        if (args.length != 0) {
            switch (args[0]) {
                case "-c":
                    //считываем имя файла
                    String fileName = getFileNameFromConsole();

                    // читаем файл
                    BufferedReader readerFile = new BufferedReader(new FileReader(fileName));

                    //поиск максимального id
                    int maxId = getMaxId(readerFile);

                    //записываем данные в файл
                    writeToFile(args, fileName, maxId);
                    break;
            }
        }

    }

    private static void writeToFile(String[] args, String fileName, int maxId) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        writer.newLine();
        String record = String.format("%-8d%-30.30s%-8.8s%-4.4s", ++maxId, args[1], args[2], args[3]);
        writer.write(record);
        writer.close();
    }

    private static int getMaxId(BufferedReader readerFile) throws IOException {
        int id;
        int maxId = 0;
        while (readerFile.ready()) {
            id = Integer.parseInt(readerFile.readLine().substring(0,8).trim());
            if (id > maxId) {
                maxId = id;
            }
        }
        readerFile.close();
        return maxId;
    }

    private static String getFileNameFromConsole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
}
