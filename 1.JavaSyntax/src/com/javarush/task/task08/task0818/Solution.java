package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> works = new HashMap<>();
        for (int i = 0; i < 10; i ++){
            works.put("wor" + i, i + 495);
        }
    return works;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        map.values().removeIf(v -> v < 500);
    }

    public static void main(String[] args) {

    }
}