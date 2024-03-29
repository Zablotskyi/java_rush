package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);

        int comma = 0;
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data == 44) {
                comma ++;
            }
        }
        System.out.println(comma);
        reader.close();
        inputStream.close();

    }
}
