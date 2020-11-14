package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;


/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        if (args.length != 0) {
            switch (args[0]) {
                case "-c":   // создаем новую запись о людях
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i += 3) {
                            create(args[i], args[i + 1], args[i + 2]);
                        }
                    }
                    break;
                case "-u":    // обновляем соответствующие данные людей с заданными id
                    synchronized (allPeople) {
                         for (int i = 1; i < args.length; i += 4) {
                             update(args[i], args[i + 1], args[i + 2], args[i + 3]);
                         }
                    }
                    break;
                case "-d":   // обнуляем запись о человеке (не удаляем, а присваиваем всем полям null !!!)
                     synchronized (allPeople) {
                          for (int i = 1; i < args.length; i += 1) {
                               delete(args[i]);
                          }
                     }
                     break;
                case "-i":   // выводим информацию на экран о всех людях с заданными id: name sex bd
                     synchronized (allPeople) {
                          for (int i = 1; i < args.length; i += 1) {
                              read(args[i]);
                          }
                     }
                     break;
            }
        }
    }
    private static void create (String name, String sex, String bd) throws ParseException {
        //-c - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
        Date newInDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(bd);
        if ("м".equalsIgnoreCase(sex)) {
            allPeople.add(Person.createMale(name, newInDate));
        } else if ("ж".equalsIgnoreCase(sex)) {
            allPeople.add(Person.createFemale(name, newInDate));
        }
        System.out.println(allPeople.size() - 1);
    }
    private static void update (String id, String name, String sex, String bd) throws ParseException {
        //-u - обновляет соответствующие данные людей с заданными id
        Date newInDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(bd);
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
    private static void delete (String id){
        //-d - производит логическое удаление человека с id, заменяет все его данные на null
        Person deletingPerson = allPeople.get(Integer.parseInt(id));
        deletingPerson.setName(null);
        deletingPerson.setSex(null);
        deletingPerson.setBirthDate(null);
        allPeople.set(Integer.parseInt(id), deletingPerson);
    }
    private static void read (String id){
        //-i - выводит на экран информацию о всех людях с заданными id: name sex bd
        Person readingPerson = allPeople.get(Integer.parseInt(id));
        System.out.println(readingPerson);
    }

}
