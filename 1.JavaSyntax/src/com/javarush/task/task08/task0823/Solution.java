package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //напишите тут ваш код
        String s1 = string;
        String s2 = "";
        s2 = s2 + s1.substring(0, 1).toUpperCase();
        for (int i = 1; i < s1.length(); i ++) {
            if (" ".equals(s1.substring(i - 1, i)))
                s2 = s2 + s1.substring(i, i + 1).toUpperCase();
            else
                s2 = s2 + s1.substring(i, i + 1);
        }
        System.out.println(s2);
    }
}
