package com.javarush.task.task07.task0702;

/*
Массив из строчек в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String [] list = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // создаем массив и вводим строки
        for (int i = 2; i < list.length; i ++)
            list [i] = reader.readLine();
        // выводим массив в обратном порядке
        for (int i = list.length - 1; i >= 0; i --)
            System.out.println(list[i]);
    }
}