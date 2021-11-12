package com.javarush.task.task07.task0707;

import java.util.ArrayList;/*
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        //создаем список на 5 элементов и инициализируем их
        ArrayList <String> list = new ArrayList<String>(5);
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        //выводим размер списка на экран
        int count = list.size();
        System.out.println(count);
        //цикл для вывода содержимого списка на экран
        for (int i = 0; i < list.size(); i ++)
            System.out.println(list.get(i));



    }
}
