package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;/*
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);
        long minByte = inputStream.read();
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data < minByte) {
                minByte = data;
            }
        }
        reader.close();
        inputStream.close();
        System.out.println(minByte);
    }
}
