package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        //создаем список строк, которым будем заполнять элементы массива
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i ++) {
            list.add("str" + i);
        }
        //создаем массив который состоит из списков
        ArrayList<String>[] array = new ArrayList[10];
        for (int i = 0; i < 10; i ++) {
            array [i] = list;
        }

        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}