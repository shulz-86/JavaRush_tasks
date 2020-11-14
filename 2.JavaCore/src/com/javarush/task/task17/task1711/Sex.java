package com.javarush.task.task17.task1711;

public enum Sex {
    MALE,
    FEMALE;

    @Override
    public String toString() {
        return MALE.equals(this) ? "м" : "ж";
    }
}
