package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileAdress = reader.readLine();

        List<Integer> list = new ArrayList<>();

        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileAdress)));
        try {
            while (fileReader.ready()){
                int i = Integer.parseInt(fileReader.readLine());
                if (i % 2 == 0)
                    list.add(i);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            reader.close();
            fileReader.close();
        }

        Collections.sort(list);
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
