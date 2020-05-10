package com.javarush.task.task09.task0923;

/* 
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        String textNew = text.replaceAll(" ", "");
        for(int i = 0; i < textNew.length(); i++) {
            if(isVowel(textNew.charAt(i))) {
                System.out.print(textNew.charAt(i) + " ");
            }
        }
        System.out.println("");
        for (int j = 0; j < textNew.length(); j++) {
            if(!isVowel(textNew.charAt(j))) {
                System.out.print(textNew.charAt(j) + " ");
            }
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}