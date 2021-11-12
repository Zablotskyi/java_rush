package com.javarush.task.task18.task1828;

/*
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader readerFileName = new BufferedReader(new InputStreamReader(System.in));
        String fileName = readerFileName.readLine();

        List<String> list = new ArrayList<>();

        int id = 0;

        if(args.length > 0) {
            BufferedReader readerFile = new BufferedReader(new FileReader(fileName));
            while (readerFile.ready()) {
                list.add(readerFile.readLine());
            }
            BufferedWriter writerFile = new BufferedWriter(new FileWriter(fileName));

            switch (args[0]) {
                case "-u": {
                    for (int i = 0; i < list.size(); i++) {
                        id = Integer.parseInt(list.get(i).substring(0, 8).trim());
                        if (id == Integer.parseInt(args[1])) {
                            list.set(i, String.format("%-8.8s%-30.30s%-8.8s%-4.4s", args[1], args[2], args[3], args[4]));
                        }
                    }
                }
                break;

                case "-d": {
                    for (int i = 0; i < list.size(); i++) {
                        id = Integer.parseInt(list.get(i).substring(0, 8).trim());
                        if (id == Integer.parseInt(args[1])) {
                            list.remove(i);
                        }
                    }
                }
                break;
            }
            for (String s : list) {
                writerFile.write(s + "\n");
            }
            readerFileName.close();
            readerFile.close();
            writerFile.close();
        }
    }
}