package com.javarush.task.task13.task1318;

/*
Чтение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        InputStream inStream = null;
        BufferedInputStream buffer = null;

        try {
            inStream = new FileInputStream(fileName);
            buffer = new BufferedInputStream(inStream);

            while (buffer.available() > 0) {
                char c = (char) buffer.read();
                System.out.print(c);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            inStream.close();
            buffer.close();
            reader.close();
        }
    }
}