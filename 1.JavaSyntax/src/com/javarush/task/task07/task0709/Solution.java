package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;/*
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //создаем список на 5 строк и считываем их с клавиатуры
        ArrayList<String> list = new ArrayList<String>(5);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i ++) {
            String s = reader.readLine();
            list.add(s);
        }
        //ищем самую короткую строку
        int min = list.get(0).length();
        for (int i = 0; i < 5; i ++) {
            if (list.get(i).length() <= min)
                min = list.get(i).length();
        }
        //выводим самую короткую строку на экран
        for (int i = 0; i < 5; i ++) {
            if (list.get(i).length() == min)
                System.out.println(list.get(i));
        }
    }
}
