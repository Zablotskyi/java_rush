package com.javarush.task.task07.task0711;

/*
Удалить и вставить
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //создаем список на 5 строк и ввидим их с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>(5);
        for (int i = 0; i < 5; i ++) {
            String s = reader.readLine();
            list.add(s);
        }
        //копируем крайнюю строку и вставляем ее в начало списка 13 раз
        for (int i = 0; i < 13; i ++) {
            String line = list.get(4);
            list.remove(4);
            list.add(0, line);

        }
        //выводим новый список на экран
        for (int i = 0; i < 5; i ++) {
            System.out.println(list.get(i));
        }
    }
}
