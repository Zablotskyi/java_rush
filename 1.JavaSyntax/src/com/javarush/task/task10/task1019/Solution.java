package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //создаем мапу в которую будем сохранять наши строки и числа
        HashMap<String, Integer> map = new HashMap<>();

        //создаем дополнительную переменную для проверки того что вместе числа не пустая строка
        String strId;
        //пишем цикл для заполнения мапы. И проверку - если мы ввели пустую строку то программа должна вывести мапу на экран
        while (!(strId = reader.readLine()).isEmpty()) {
            int id = Integer.parseInt(strId);
            String name = reader.readLine();
            map.put(name, id);
        }
        map.forEach((key, value) -> {
            System.out.println(value + " " + key);
        });

//        System.out.println("Id=" + id + " Name=" + name);
    }
}
