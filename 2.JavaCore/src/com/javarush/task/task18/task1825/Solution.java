package com.javarush.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, String> mapInputFiles = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileToWrite = "Lion.avi";
        String fileName = "";

        List<String> listFileName = new ArrayList<>();

        try {
            while (!(fileName.equals("end"))) {
                fileName = reader.readLine();
                listFileName.add(fileName);

                for (String s : listFileName) {
                    String[] word = s.split(".");
                    for(int i = 0; i < word.length; i ++) {
                        System.out.println(word[i]);
                    }

//            mapInputFiles.put((word[word.length - 1]), word[0]);
                }
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        for(String name : listFileName) {
//            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(name));
//            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileToWrite, true));
//
//            while (bufferedInputStream.available() > 0) {
//                int data;
//                data = bufferedInputStream.read();
//                bufferedOutputStream.write(data);
//            }
//            bufferedInputStream.close();
//            bufferedOutputStream.close();
//        }
    }
}
