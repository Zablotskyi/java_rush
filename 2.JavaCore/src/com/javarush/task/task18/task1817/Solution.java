package com.javarush.task.task18.task1817;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;/*
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        List<Integer> list = new ArrayList<>();

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            list.add(data);
        }
        fileInputStream.close();

        int space = 0;
        int symbol = 0;
        for (Integer integer : list) {
            if (integer == 32) {
                space ++;
                symbol ++;
            } else {
                symbol ++;
            }
        }
        double result = (double) space / symbol * 100;
        System.out.printf("%.2f", result);

    }

}
