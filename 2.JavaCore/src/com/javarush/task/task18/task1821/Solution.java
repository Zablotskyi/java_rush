package com.javarush.task.task18.task1821;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream(args[0]);

        int[] array = new int[256];
        while (true) {
            try {
                if (!(inputStream.available() > 0)) break;
                array[inputStream.read()]++;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        List<String> list = new ArrayList<>();
        for (int i = 0; i < array.length; i ++) {
            if (array[i] > 0) {
                list.add((char) i + " " + array[i]);
            }
        }

        for (String s : list) {
            System.out.println(s);
        }
        inputStream.close();
    }
}
