package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //считываем с консоли два имени файлов
        String firstFile = reader.readLine();
        String secondFile = reader.readLine();
        //читаем построчно файлы и записываем их в отдельные списки
        try {
            BufferedReader fReader = new BufferedReader(new InputStreamReader(new FileInputStream(firstFile)));
            while (fReader.ready()) {
                allLines.add(fReader.readLine());
            }
            fReader.close();

            BufferedReader sReader = new BufferedReader(new InputStreamReader(new FileInputStream(secondFile)));
            while (sReader.ready()) {
                forRemoveLines.add(sReader.readLine());
            }
            sReader.close();
        }
        catch (Exception e) {
            System.out.println("Файл не найден");
        }
        reader.close();
        Solution solution = new Solution();
        solution.joinData();
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        }
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
