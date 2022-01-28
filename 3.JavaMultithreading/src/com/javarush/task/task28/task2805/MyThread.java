package com.javarush.task.task28.task2805;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {

    private static volatile AtomicInteger priorityCount = new AtomicInteger(1);
    private synchronized void correctPriority() {
        int newPriority = priorityCount.getAndIncrement();

        newPriority = getThreadGroup() != null && newPriority > getThreadGroup().getMaxPriority() ?
                getThreadGroup().getMaxPriority() : newPriority;

        setPriority(newPriority);
        if (priorityCount.intValue() > MAX_PRIORITY) {
            priorityCount.set(1);
        }
    }

    public MyThread() {
        correctPriority();
    }

    public MyThread(Runnable target) {
        super(target);
        correctPriority();
    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
        correctPriority();
    }

    public MyThread(String name) {
        super(name);
        correctPriority();
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        correctPriority();
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
        correctPriority();
    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
        correctPriority();
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
        correctPriority();
    }
}
