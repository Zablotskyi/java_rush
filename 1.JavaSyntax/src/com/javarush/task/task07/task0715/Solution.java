package com.javarush.task.task07.task0715;

import java.util.ArrayList;/*
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        //создаем список и сразу инициализируем его
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        //создаем цикл для вставки после каждой строки слова "именно"
        int i = 1;
        while (i < 6){
            list.add(i, "именно");
            i += 2;
        }
        //выводим на экран новый список
        for (int j = 0; j < list.size(); j ++) {
            System.out.println(list.get(j));
        }

    }
}
