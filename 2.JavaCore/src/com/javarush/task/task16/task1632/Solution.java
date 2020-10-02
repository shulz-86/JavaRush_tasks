package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    public static void main(String[] args) {
    }
    public static class Thread1 extends Thread {
        public void run () {
            while (true) {
            }
        }
    }
    public static class Thread2 extends Thread {
        public void run () {
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }
        }
    }
    public static class Thread3 extends Thread {
        public void run () {
            while (true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Нить 3 - что-то пошло не так");
                }
            }
        }
    }
    public static class Thread4 extends Thread implements Message{
        public void run () {
            while (!isInterrupted()){
            }
        }
        @Override
        public void showWarning() {
            this.interrupt();
        }
    }
    public static class Thread5 extends Thread {
        public void run () {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int count = 0;
            try {
                while (true) {
                    try {
                        String s = reader.readLine();
                        if(s.equals("N")){
                            System.out.println(count);
                            break;
                        } else {
                            count += Integer.parseInt(s);
                        }
                    } catch (NumberFormatException ex) {
                        ex.printStackTrace();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }
}