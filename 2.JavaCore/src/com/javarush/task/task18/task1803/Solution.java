package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //создаем массив на 256 элементов, так как байтов у нас от -128 до +127 = 256 элементов.
        int[] array = new int[256];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);
        //изначально все элементы массива у нас по умолчанию нули, а передайнный байт указываем в качестве индекса массива
        //и инкрементируем содержимый элемент массива(таким образом определяем сколько у нас было повторов)
        while (inputStream.available() > 0) {
            array[inputStream.read()] ++;
        }
        reader.close();
        inputStream.close();

        int maxCount = 0;
        for (int i = 0; i < array.length; i ++) {
            if (array[i] > maxCount) {
                maxCount = array[i];
            }
        }
        for (int j = 0; j < array.length; j ++) {
            if (maxCount == array[j]) {
                System.out.print(j + " ");
            }
        }
    }
}
