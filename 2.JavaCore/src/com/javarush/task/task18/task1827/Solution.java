package com.javarush.task.task18.task1827;

/*
Прайсы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        BufferedReader readerFile = new BufferedReader(new FileReader(fileName));

        int id = 0;
        int maxID = 0;

        if (args.length > 0) {
            switch (args[0]) {
                case "-c" : {
                    while (readerFile.ready()) {
                        id = Integer.parseInt(readerFile.readLine().substring(0, 8).trim());
                        if (id > maxID) {
                            maxID = id;
                        }
                    }
                    writer.write(String.format("\n%-8.8s%-30.30s%-8.8s%-4.4s", maxID + 1, args[1], args[2], args[3]));
                }
                default: {
                    reader.close();
                    readerFile.close();
                    writer.close();
                }
            }
        }
    }
}
