package com.javarush.task.task18.task1820;

import java.io.*;
/*
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName1)));
        BufferedWriter writerFile = new BufferedWriter(new FileWriter(fileName2));

        //читаем с файла дробные (вещественные) числа, округляем их и записываем во второй файл
        try {
            String s = null;
            while (fileReader.ready()) {
                s = fileReader.readLine();
            }
            String[] numbers = s.split(" ");
            for (String str : numbers) {
                double n = Math.round(Double.parseDouble(str));
                writerFile.write(String.format("%.0f", n) + " ");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            fileReader.close();
            writerFile.close();
        }
    }
}
