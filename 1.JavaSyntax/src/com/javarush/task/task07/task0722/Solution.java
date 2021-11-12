package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        //создаем список строк и вводим их с клавиатуры до тех пор, пока не будет введено слово "end"
        //слово "end" в список не добавляем
        ArrayList <String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            list.add(s);
            if (s.equals("end")) {
                list.remove(s);
                break;
            }
        }
        //с помощью цикла выводим список на экран, каждый элемент с новой строки
        for (int i = 0; i < list.size(); i ++) {
            System.out.println(list.get(i));
        }
    }
}