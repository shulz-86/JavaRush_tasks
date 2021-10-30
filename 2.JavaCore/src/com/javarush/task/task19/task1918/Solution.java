package com.javarush.task.task19.task1918;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


/* 
Знакомство с тегами
*/

public class Solution {
    public static void main(String[] args) {
        String tag = args[0];
        String fileName = null;
        
        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = consoleReader.readLine();
        } catch (IOException e) {
        }
        
        StringBuilder readFileContent = new StringBuilder();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                readFileContent.append(fileReader.readLine().replaceAll("[\\r\\n]+", ""));
            }
        } catch (IOException e) {
        }

        Document document = Jsoup.parse(readFileContent.toString(), "", Parser.xmlParser());
        Elements elem = document.select(args[0]);
        for (Element elements : elem){
            System.out.println(elements);
        }
    }
}
