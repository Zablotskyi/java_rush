package com.javarush.task.task08.task0827;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date day = new Date(date); //создание нового объекта даты на основе String data
        SimpleDateFormat ff = new SimpleDateFormat("D"); //задаётся формат для даты, "D"-номер дня в году
        int x = Integer.parseInt(ff.format(day)); // применяем формат к дате и преобразуем к типу int
        return x % 2 != 0; //проверка на нечётность и возвращение значения типа boolean
    }
}
