package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //создаем список и вводим строки с клавиатуры пока не введем пустую или нулевую строку
        ArrayList<String> strings = new ArrayList<String>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }
        //пищем цикл для вывода строк на экран
        for (int i = 0; i < strings.size(); i ++) {
            //условие для строк которые имею четное количество символов
            if (strings.get(i).length() % 2 == 0) {
                System.out.println(strings.get(i) + " " + strings.get(i));
            }
            //условие для строк которые имею не четное количество символов
            else if (strings.get(i).length() % 2 != 0) {
                System.out.println(strings.get(i) + " " + strings.get(i) + " " + strings.get(i));
            }
        }
    }
}
