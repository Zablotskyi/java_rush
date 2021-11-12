package com.javarush.task.task08.task0802;

/*
Map из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        //создаем коллекцию типа Map, и сразу инициализируем ее
        Map<String, String> plants = new HashMap<>();
        plants.put("арбуз", "ягода");
        plants.put("банан", "трава");
        plants.put("вишня", "ягода");
        plants.put("груша", "фрукт");
        plants.put("дыня", "овощ");
        plants.put("ежевика", "куст");
        plants.put("жень-шень", "корень");
        plants.put("земляника", "ягода");
        plants.put("ирис", "цветок");
        plants.put("картофель", "клубень");
        //пишем цикл forEach для вывода строк коллекции, каждую с новой строки
        plants.forEach((key, value) -> {
            System.out.println(key + " - " + value);
        });
    }
}
