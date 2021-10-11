package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome (List<Horse> horses) {
        this.horses = horses;
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            Thread.sleep(200);
            print();
//            if (getHorses().stream().anyMatch(a -> a.getDistance() > 156)) {
//                break;
//            }
        }
    }

    public void move() {
        for (Horse horse : horses) {
            horse.move();
        }
    }

    public void print() {
        for (Horse horse : horses) {
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        Collections.sort(horses);
        Collections.reverse(horses);
        return horses.get(0);
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = new ArrayList<>();

        Horse zorya = new Horse("Зоря", 3,0);
        Horse marta = new Horse("Марта", 3,0);
        Horse buyan = new Horse("Буян", 3,0);

        horses.add(zorya);
        horses.add(marta);
        horses.add(buyan);

        game  = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }
}
