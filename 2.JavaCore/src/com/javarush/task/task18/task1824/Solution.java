package com.javarush.task.task18.task1824;

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "";

        try {
            while (true) {
                fileName  = reader.readLine();
                InputStream inputStream = new FileInputStream(fileName);
                inputStream.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
