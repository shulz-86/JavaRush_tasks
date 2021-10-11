package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/

public class Solution extends OutputStream implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;

    private final String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.fileName = fileName;
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\r\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();

    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.stream = new FileOutputStream(fileName, true);
    }

    @Override
    public void write(int b) throws IOException {

    }

    @Override
    public void close() throws IOException {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution("your_file_name.txt");
        solution.writeObject("Какие-то данные...");

        String filePath = "your_file_name.txt";
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath));
        outputStream.writeObject(solution);
        solution.close();
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath));
        Solution solution2 = (Solution) inputStream.readObject();
        solution2.writeObject("Данные нового потока.");
        solution2.close();
        inputStream.close();
    }
}
