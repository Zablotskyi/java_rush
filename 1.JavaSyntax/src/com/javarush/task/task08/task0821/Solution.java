package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String, String> fio = new HashMap<>();
        fio.put("Кравченко", "Артем");
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

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
