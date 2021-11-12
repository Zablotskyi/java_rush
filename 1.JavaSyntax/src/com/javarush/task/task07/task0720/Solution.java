package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        //вводим количество строк n
        int n = Integer.parseInt(reader.readLine());
        //вводим количество строк m, которые нужно перенести в конец списка
        int m = Integer.parseInt(reader.readLine());
        //создаем список и вводим строки с клавиатуры
        ArrayList<String> strings = new ArrayList<>(n);
        for (int i = 0; i < n; i ++) {
            String s = reader.readLine();
            strings.add(s);
        }
        //пишем цикл для перемещения строк
        for (int i = 0; i < m; i ++) {
            strings.add(strings.get(0));
            strings.remove(0);
        }
        //пишем цикл для вывода нового списка
        for (int i = 0; i < strings.size(); i ++) {
            System.out.println(strings.get(i));
        }
    }
}
