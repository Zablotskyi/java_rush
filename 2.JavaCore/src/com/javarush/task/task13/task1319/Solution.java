package com.javarush.task.task13.task1319;

/*
Писатель в файл с консоли
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        String fileAdress = "e:\\mysite\\JavaRush\\Test\\src\\Test\\" + fileName + ".txt";

            try (BufferedWriter writter = new BufferedWriter(new FileWriter(fileAdress))) {
                String line;
                while (!(line = reader.readLine()).equals("exit")) { // Прерывание цикла при написании строки exit
                    writter.write(line + "\n");
                }
                writter.write("exit");
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                reader.close();
            }
    }
}
