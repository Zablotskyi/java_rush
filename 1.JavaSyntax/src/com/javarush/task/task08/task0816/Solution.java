package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        map.put("Смирнов2", dateFormat.parse("FEB 1 2012"));
        map.put("Смирнов3", dateFormat.parse("MAY 1 2012"));
        map.put("Смирнов4", dateFormat.parse("MAY 1 2012"));
        map.put("Смирнов5", dateFormat.parse("MAY 1 2012"));
        map.put("Смирнов6", dateFormat.parse("MAY 1 2012"));
        map.put("Смирнов7", dateFormat.parse("MAY 1 2012"));
        map.put("Смирнов8", dateFormat.parse("JUL 1 2012"));
        map.put("Смирнов9", dateFormat.parse("MAY 1 2012"));
        map.put("Смирнов0", dateFormat.parse("DEC 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        map.entrySet().removeIf(entry -> entry.getValue().getMonth() > 4 && entry.getValue().getMonth() < 8);
    }
    public static void main(String[] args) {

    }
}
