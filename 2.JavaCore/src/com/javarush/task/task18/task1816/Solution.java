package com.javarush.task.task18.task1816;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //создаем поток чтения с файла, и в качестве аргумента передаем пусть файла, который в свою очереть передается
        //в качестве аргумента программы
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        //создаем список, куда будем записывать байты считынные с файла, каждый в новую строку
        List<Integer> list = new ArrayList();

        //циклом читаем файл, если он не пустой. Записываем полученные байты в список
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            list.add(data);
        }
        fileInputStream.close();
        //проходимся по списку. Если байт входит в диапазон с таблицей символов ASCII. В ней находим английские буквы. Заглавные (65-90)  и строчные (97-122).
        //если есть совпадение то итерируем счетчик
        int count = 0;
        for (int i = 0; i < list.size(); i ++) {
            if ((list.get(i) >= 65 && list.get(i) <= 90) || (list.get(i) >= 97 && list.get(i) <= 122)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
