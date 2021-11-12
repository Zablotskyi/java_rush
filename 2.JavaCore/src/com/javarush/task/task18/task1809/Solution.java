package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firsFile = reader.readLine();
        String secondFile = reader.readLine();
        LinkedList<Integer> list = new LinkedList<>();

        FileInputStream inputStream = new FileInputStream(firsFile);
        FileOutputStream outputStream = new FileOutputStream(secondFile);

        while (inputStream.available() > 0) {
            list.addLast(inputStream.read());
        }
        for (int i = list.size() - 1; i >= 0; i --) {
            outputStream.write(list.get(i));
        }
        reader.close();
        inputStream.close();
        outputStream.close();
    }
}
