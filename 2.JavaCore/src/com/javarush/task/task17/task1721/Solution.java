package com.javarush.task.task17.task1721;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        allLines = Files.readAllLines(Paths.get(file1));
        forRemoveLines = Files.readAllLines(Paths.get(file2));
        Solution solution = new Solution();
        solution.joinData();
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else if (!allLines.containsAll(forRemoveLines)) {
            allLines.clear();
            throw new CorruptedDataException();
        }


    }
}
