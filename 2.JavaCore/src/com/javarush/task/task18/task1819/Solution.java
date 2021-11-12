package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        List<Integer> list = new ArrayList<>();

        InputStream inputStream2 = new FileInputStream(fileName2);
        //читаем байты со второго файла и записываем их в список list
        while (inputStream2.available() > 0) {
            int data = inputStream2.read();
            list.add(data);
        }

        InputStream inputStream1 = new FileInputStream(fileName1);
        //читаем байты с первого файла и добавляем их в список list
        while (inputStream1.available() > 0) {
            int data = inputStream1.read();
            list.add(data);
        }

        OutputStream outputStream = new FileOutputStream(fileName1);
        //проходимся по листу и записываем все ячейки в файл
        for (int data : list) {
            outputStream.write(data);
        }
        inputStream1.close();
        inputStream2.close();
        outputStream.close();
    }
}
