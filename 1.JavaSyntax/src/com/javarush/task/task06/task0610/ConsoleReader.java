package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader readstring = new BufferedReader (new InputStreamReader(System.in));
        String s = readstring.readLine();
        return s;

    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader readint = new BufferedReader (new InputStreamReader(System.in));
        int a = Integer.parseInt (readint.readLine());
        return a;

    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader readdooble = new BufferedReader(new InputStreamReader(System.in));
        double b = Double.parseDouble(readdooble.readLine());
        return b;

    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader readboolean = new BufferedReader(new InputStreamReader(System.in));
        boolean c = Boolean.parseBoolean(readboolean.readLine());
        return c;

    }

    public static void main(String[] args) throws Exception {

    }
}
