package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        // создаем список на 10 элементов и вводим их с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i ++) {
            list.add(i, reader.readLine());
        }
        //пишем цикл на проверку строк и вывода первой строки которая не входит в порядок
        for (int i = 1; i < list.size(); i ++) {
            if (list.get(i - 1).length() > list.get(i).length()) {
                System.out.println(i);
                break;
            }
        }
    }
}

