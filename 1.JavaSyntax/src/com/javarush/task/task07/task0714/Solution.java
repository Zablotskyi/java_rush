package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //создаем список и вводим с клавиатуры 5 строк
        ArrayList<String> list = new ArrayList<String>(5);
        for (int i = 0; i < 5; i ++) {
            String s = reader.readLine();
            list.add(s);
        }
        list.remove(2);
        Collections.reverse(list);
        for (int i = 0; i < 4; i ++) {
            System.out.println(list.get(i));
        }
    }
}
