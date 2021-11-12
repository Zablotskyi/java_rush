package com.javarush.task.task18.task1808;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //вводим с клавиатуры три имени файла
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        //создаем потоки. Один на чтение файла и два на запись двух разных файлов
        FileInputStream inputStream = new FileInputStream(fileName1);
        FileOutputStream outputStream2 = new FileOutputStream(fileName2);
        FileOutputStream outputStream3 = new FileOutputStream(fileName3);
        //находим половину считанных байт и добавляем остаток от деления
        int halfCount = inputStream.available() / 2 + inputStream.available() % 2;
        //создаем массив куда читаем первую часть
        byte[] partOne = new byte[halfCount];
        //создаем массив куда читаем вторую часть
        byte[] partTwo = new byte[inputStream.available() - halfCount];
        //читаем две части по очереди
        inputStream.read(partOne);
        inputStream.read(partTwo);
        //пишем в разные файлы соответствующую часть
        outputStream2.write(partOne);
        outputStream3.write(partTwo);

        reader.close();
        inputStream.close();
        outputStream2.close();
        outputStream3.close();
    }
}
