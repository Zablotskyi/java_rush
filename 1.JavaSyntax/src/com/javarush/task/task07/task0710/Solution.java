package com.javarush.task.task07.task0710;

/*
В начало списка
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //создаем список и добавляем 10 элементов в НАЧАЛО списка
        ArrayList<String> list = new ArrayList<String>(10);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i ++) {
            String s = reader.readLine();
            list.add(0, s);
        }
        //выводим список на экран
        for (int i = 0; i < 10; i ++) {
            System.out.println(list.get(i));
        }
    }
}
