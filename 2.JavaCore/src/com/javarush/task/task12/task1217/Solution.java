package com.javarush.task.task12.task1217;

/* 
Лететь, бежать и плыть
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {

        void fly(CanFly canFly);
    }
    public interface CanRun {

        void run(CanRun canRun);
    }
    public interface CanSwim {

        void swim(CanSwim canSwim);
    }

}
