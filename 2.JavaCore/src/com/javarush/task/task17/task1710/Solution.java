package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static jdk.net.SocketFlow.create;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут

        if (args.length != 0) {
            switch (args[0]){
                case "-c":
                    create(args[1],args[2],args[3]); // создаем новую запись о человеке
                    break;
                case "-u":
                    update(args[1],args[2],args[3],args[4]); // обновляем запись о человеке
                    break;
                case "-d":
                    delete(args[1]); // обнуляем запись о человеке (не удаляем, а присваиваем всем полям null !!!)
                    break;
                case "-i":
                    read(args[1]); // выводим информацию на экран
                    break;
            }
        }
    }

    private static void create(String name, String sex, String date) throws ParseException {
        //-c - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
        Date newInDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(date);
        if ("м".equalsIgnoreCase(sex)) {
            allPeople.add(Person.createMale(name, newInDate));
        } else if ("ж".equalsIgnoreCase(sex)) {
            allPeople.add(Person.createFemale(name, newInDate));
        }
        System.out.println(allPeople.size() - 1);
    }

    private static void update(String id, String name, String sex, String date) throws ParseException {
        //-u - обновляет данные человека с данным id
        Date newInDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(date);
        int index = Integer.parseInt(id);
        Person updatingPerson = allPeople.get(index);
        updatingPerson.setName(name);
        updatingPerson.setBirthDate(newInDate);

        if ("м".equalsIgnoreCase(sex)) {
            updatingPerson.setSex(Sex.MALE);
        } else if ("ж".equalsIgnoreCase(sex)) {
            updatingPerson.setSex(Sex.FEMALE);
        }
        allPeople.set(index, updatingPerson);
    }
    private static void delete(String id) {
        //-d - производит логическое удаление человека с id, заменяет все его данные на null
        Person deletingPerson = allPeople.get(Integer.parseInt(id));
        deletingPerson.setName(null);
        deletingPerson.setSex(null);
        deletingPerson.setBirthDate(null);
        allPeople.set(Integer.parseInt(id), deletingPerson);
    }
    private static void read(String id) {
        //-i - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)
        Person readingPerson = allPeople.get(Integer.parseInt(id));
        System.out.println(readingPerson);
    }

}
