package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        List <String> list = new ArrayList<>();

        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        try {
            while (fileReader.ready()) {
                list.add(fileReader.readLine());
            }

            for (String id : list) {
                if (id.startsWith(args[0] + " ")) {
                    System.out.println(id);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        reader.close();
        fileReader.close();
    }
}
