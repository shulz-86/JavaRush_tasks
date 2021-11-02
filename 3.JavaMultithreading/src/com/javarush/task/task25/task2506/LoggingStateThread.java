package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    private Thread target;

    public LoggingStateThread(Thread target) {
        this.target = target;
        setDaemon(true);
    }

    @Override
    public void run() {
        Thread.State state1 = target.getState();
        System.out.println(state1);
        while (state1 != State.TERMINATED) {
            Thread.State state2 = target.getState();
            if (state1 != state2) {
                System.out.println(state2);
                state1 = state2;
            }
            if (state2 == State.TERMINATED) {
                return;
            }
        }
    }
}
