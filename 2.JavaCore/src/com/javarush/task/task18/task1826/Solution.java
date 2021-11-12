package com.javarush.task.task18.task1826;

/*
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        //создаем поток чтения/записи из/в файл
        FileInputStream fileInputStream = new FileInputStream(args[1]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[2]);

        switch (args[0]) {
            case "-e":
                while (fileInputStream.available() > 0) {
                    int data = fileInputStream.read();
                    data++;
                    fileOutputStream.write(data);
                }
                fileInputStream.close();
                fileOutputStream.close();
                break;
            case "-d":
                while (fileInputStream.available() > 0) {
                    int data = fileInputStream.read();
                    data--;
                    fileOutputStream.write(data);
                }
                fileInputStream.close();
                fileOutputStream.close();
                break;
        }
    }
}


