package com.javarush.task.task18.task1818;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        InputStream inputStream2 = new FileInputStream(fileName2);
        OutputStream outputStream = new FileOutputStream(fileName1);

        while (inputStream2.available() > 0) {
            //читаем второй файл по байтам
            int data = inputStream2.read();
            //записываем считанные байти со второго файла в первый
            outputStream.write(data);
        }
        InputStream inputStream3 = new FileInputStream(fileName3);
        while (inputStream3.available() > 0) {
            //итаем третий файл по байтам
            int data = inputStream3.read();
            //записываем считанные байты с третьего файла в первый
            outputStream.write(data);
        }
        inputStream2.close();
        inputStream3.close();
        outputStream.close();
    }
}
