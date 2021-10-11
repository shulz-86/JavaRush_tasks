package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/

public class Solution implements Serializable {
    public static void main(String[] args) throws IOException {
        try {

        FileOutputStream fos = new FileOutputStream("your_file_name");
        ObjectOutputStream outputStream = new ObjectOutputStream(fos);

        Solution savedObject = new Solution(6);
        outputStream.writeObject(savedObject);
        fos.close();
        outputStream.close();

        FileInputStream fis = new FileInputStream("your_file_name");
        ObjectInputStream objectStream = new ObjectInputStream(fis);

        Solution loadedObject = new Solution(10);
        Object object = objectStream.readObject();

        System.out.println(savedObject.string.equals(loadedObject.string));

        fis.close();
        objectStream.close();
        System.out.println(new Solution(4));

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
