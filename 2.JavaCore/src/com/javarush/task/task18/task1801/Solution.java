package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;/*
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);
        long bigByte = 0;
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data > bigByte) {
                bigByte = data;
            }
        }
        reader.close();
        inputStream.close();
        System.out.print(bigByte);
    }
}
