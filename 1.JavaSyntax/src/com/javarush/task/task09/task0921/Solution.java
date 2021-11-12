package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;/*
Метод в try..catch
*/
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                while (true) {
                    int number = Integer.parseInt(reader.readLine());
                    list.add(number);
                }
        }

        catch (NumberFormatException | IOException e) {
            for(int n : list)
                System.out.println(n);
        }
    }
}
