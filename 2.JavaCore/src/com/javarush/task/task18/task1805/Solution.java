package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //считываем имя файла
        String fileName = reader.readLine();
        //создаем список, в который будем записывать каждый считанный байт
        List<Integer> list  = new ArrayList<>();
        //читаем цыклом каждый байт и добавляем его в новую строку списка
        FileInputStream inputStream = new FileInputStream(fileName);
        while (inputStream.available() > 0) {
            list.add(inputStream.read());
        }
        //закрываем потоки
        reader.close();
        inputStream.close();
        //сортируем список
        Collections.sort(list);
        //создаем множество,так как оно не может в себе содержать повторы, и в качестве аргумента передаем наш список list
        Set<Integer> set = new HashSet<>(list);
        //роходимся по множеству и выводим все элементы на экран через пробел
        for (int i : set) {
            System.out.print(i + " ");
        }
    }
}
