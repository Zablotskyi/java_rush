package com.javarush.task.task15.task1522;

/*
Закрепляем паттерн Singleton
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.javarush.task.task15.task1522.Planet.*;

public class Solution {
    public static void main(String[] args) {
    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        if (s.equals(SUN)) {
            thePlanet = Sun.getInstance();
        }
        else if (s.equals(MOON)) {
            thePlanet = Moon.getInstance();
        }
        else if (s.equals(EARTH)) {
            thePlanet = Earth.getInstance();
        }
        else {
            thePlanet = null;
        }
    }
}
