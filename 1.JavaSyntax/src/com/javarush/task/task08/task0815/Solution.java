package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
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
        fio.put("Шевченко", "Александр");
        return fio;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (HashMap.Entry<String, String> pair : map.entrySet())
        {
            if (pair.getValue().equals(name)) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш
        int count = 0;
        for (HashMap.Entry<String, String> pair : map.entrySet())
        {
            if (pair.getKey().equals(lastName)) count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
