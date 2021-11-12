package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        //создаем список на 10 строк и вводим их с клавиатуры
        ArrayList<String> list = new ArrayList<String>(10);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i ++) {
            String s = reader.readLine();
            list.add(s);
        }
        //ищем самую короткую и саммую длинную строку
        int maxLine = list.get(0).length(), minLine = list.get(0).length();
        for (int i = 0; i < 10; i ++) {
            if (list.get(i).length() <= minLine)
                minLine = list.get(i).length();
            if (list.get(i).length() >= maxLine)
                maxLine = list.get(i).length();
        }
        //выводим самую короткую или самую длинную строку которая встретится первой
        for (int i = 0; i < 10; i ++) {
            if (list.get(i).length() == minLine || list.get(i).length() == maxLine) {
                System.out.println(list.get(i));
                break; //ОБЯЗАТЕЛЬНО останавливаем цикл, чтоб не было больше проходов, а он вывел сразу первую подходящую строку
            }
        }
    }
}
