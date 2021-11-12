package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileNmae = reader.readLine();

        int [] array = new int [255];

        FileInputStream inputStream = new FileInputStream(fileNmae);

        while (inputStream.available() > 0) {
            array[inputStream.read()] ++;
        }
        reader.close();
        inputStream.close();

        int minCounter = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i ++) {
            if (array[i] > 0 && array[i] < minCounter) {
                minCounter = array[i];
            }
        }
        for (int i = 0; i < array.length; i ++) {
            if (array[i] == minCounter) {
                System.out.print(i + " ");
            }
        }
    }
}
