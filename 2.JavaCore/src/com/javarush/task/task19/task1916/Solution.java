package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        // читпем имена файлов
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        //читаем файлы и записывакм их в листы
        BufferedReader fileReader1 = new BufferedReader(new FileReader(file1));
        BufferedReader fileReader2 = new BufferedReader(new FileReader(file2));

        List<String> listFile1 = new ArrayList<>();
        List<String> listFile2 = new ArrayList<>();

        while (fileReader1.ready()) {
            listFile1.add(fileReader1.readLine());
        }
        while (fileReader2.ready()) {
            listFile2.add(fileReader2.readLine());
        }

        fileReader1.close();
        fileReader2.close();

        // объединяем листы в один общий
        // пока не пусты лист1 и лист2
        while (listFile1.size() > 0 && listFile2.size() > 0) {

            if(listFile1.get(0).equals(listFile2.get(0))) { // если нулевые элементы равны, добавляем в Lines SAME
                lines.add(new LineItem(Type.SAME, listFile1.get(0)));
                listFile1.remove(0); //удаляем из обоих списков нулевые элементы.
                listFile2.remove(0);
            } else if(listFile1.get(1).equals(listFile2.get(0))) {
                lines.add(new LineItem(Type.REMOVED, listFile1.get(0)));
                listFile1.remove(0); //удаляем нулевой элемент первого списка.
            } else if(listFile1.get(0).equals(listFile2.get(1))) {
                lines.add(new LineItem(Type.ADDED, listFile2.get(0)));
                listFile2.remove(0); //удаляем нулевой элемент второго списка.
            }
        }

        // проверяем, если пуст один из листов, то
        if(listFile1.size() == 0) {
            while (listFile2.size() > 0) {
                lines.add(new LineItem(Type.ADDED, listFile2.get(0))); //удаляем первую строку из листа2
                listFile2.remove(0);
            }
        }
        if(listFile2.size() == 0) {
            while (listFile1.size() > 0) {
                lines.add(new LineItem(Type.REMOVED, listFile1.get(0))); //удаляем первую строку из листа1
                listFile1.remove(0);
            }
        }

        for(LineItem l : lines) {
            System.out.println(l.type+" "+l.line);
        }
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
