package com.javarush.task.task08.task0817;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> fio = new HashMap<>();
        fio.put("Макаренко", "Артем");
        fio.put("Кравченко", "Андрей");
        fio.put("Петрова", "Оксана");
        fio.put("Гриценко", "Марина");
        fio.put("Полищук", "Оксана");
        fio.put("Кущенко", "Алла");
        fio.put("Федорченко", "Максим");
        fio.put("Заблотский", "Василий");
        fio.put("Бугров", "Николай");
        fio.put("Шевченко", "Марина");
        return fio;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (String s : copy.values()) {
            if ((Collections.frequency(copy.values(), s)) > 1)
                removeItemFromMapByValue(map, s);
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
