package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static final double greenMinRange = 0.0;
    public static final double yellowMinRange = 3.0;
    public static final double redMinRange = 4.0;
    public static final double redMaxRange = 5.0;
    public static final double commonCycleOfTrafficLights = 5.0;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine());

        if ((t% commonCycleOfTrafficLights) >= greenMinRange && (t% commonCycleOfTrafficLights) < yellowMinRange) {
            System.out.println("зелёный");
        }
        if ((t% commonCycleOfTrafficLights) >= yellowMinRange && (t% commonCycleOfTrafficLights) < redMinRange) {
            System.out.println("жёлтый");
        }
        if ((t% commonCycleOfTrafficLights) >= redMinRange && (t% commonCycleOfTrafficLights) < redMaxRange) {
            System.out.println("красный");
        }

    }
}