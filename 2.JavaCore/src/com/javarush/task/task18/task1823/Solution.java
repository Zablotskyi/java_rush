package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader readerFileName = new BufferedReader(new InputStreamReader(System.in));
        String fileName;

        while (!(fileName = readerFileName.readLine()).equals("exit")) {
            new ReadThread(fileName).start();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут
        public void run() {
            int[] symbol = new int[256];
            try {
                InputStream inputStreamReader = new FileInputStream(fileName);
                while (inputStreamReader.available() > 0) {
                    symbol[inputStreamReader.read()] ++;
                }
                int max = 0;
                for(int i = 0; i < symbol.length; i ++) {
                    if (symbol[i] > max) {
                        max = symbol[i];
                        resultMap.put(fileName, i);
                    }
//                    resultMap.forEach((key, value) -> {
//                        System.out.println(key + " " + value);
//                    });
                }
                inputStreamReader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
