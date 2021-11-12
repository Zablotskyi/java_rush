package com.javarush.task.task07.task0703;

/*
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //создаем числовой массив
        int [] number = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //создаем строчный массив и цикл для ввода строк с клавиатуры
        String [] list = new String[10];
        for (int i = 0; i<list.length; i ++) {
            list [i] = reader.readLine();
        }
        //второй цикл предназначен для приспоения ячейкам первого массива длины строк второго массива
        for (int i = 0; i < list.length; i ++) {
            number[i] = list[i].length();
            System.out.println(number[i]);
        }
    }
}
