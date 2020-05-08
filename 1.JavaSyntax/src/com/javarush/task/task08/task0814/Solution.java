package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;
/* 
Больше 10? Вы нам не подходите
*/
public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<Integer>();
        while (20 > set.size()) {
            int n = (int)(Math.random()*100);
            set.add(n);
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        /*Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            Integer current = iterator.next();
            if (current > 10) {
                iterator.remove();
            }
        } */
        set.removeIf(current -> current > 10);
        return set;
    }

    public static void main(String[] args) {
        //System.out.println(removeAllNumbersGreaterThan10(createSet()));
    }
}
