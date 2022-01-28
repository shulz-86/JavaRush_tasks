package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;

import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;


/* 
Что внутри папки?
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Path path = Paths.get(reader.readLine());

            if(!Files.isDirectory(path)) {
                System.out.println(path.toString() + " - не папка");
            } else {
                AtomicInteger folderCounter = new AtomicInteger();
                AtomicInteger fileCounter = new AtomicInteger();
                AtomicLong sizeCounter = new AtomicLong();

                Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
                    @Override
                    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                        if (!dir.equals(path)) {
                            folderCounter.incrementAndGet();
                        }
                        return FileVisitResult.CONTINUE;
                    }

                    @Override
                    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                        fileCounter.incrementAndGet();
                        sizeCounter.addAndGet(attrs.size());
                        return FileVisitResult.CONTINUE;
                    }
                });

                System.out.println("Всего папок - " + folderCounter);
                System.out.println("Всего файлов - " + fileCounter);
                System.out.println("Общий размер - " + sizeCounter);
            }
        }
    }
}
