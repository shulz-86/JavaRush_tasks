package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {
        Beach b1 = new Beach("1", 20, 30);
        Beach b2 = new Beach("2", 10, 20);
        System.out.println(b1.compareTo(b2));

        Beach b3 = new Beach("3", 15, 21);
        Beach b4 = new Beach("4", 312, 1);
        System.out.println(b3.compareTo(b4));
    }

    @Override
    public synchronized int compareTo(Beach o) {
        return (int) (this.distance - o.distance) + (o.quality - this.quality);
    }
}
