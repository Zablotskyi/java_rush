package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Keyboard implements Runnable {
    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int sum = 0;
        while (true) {
            try {
                if (!!((s = reader.readLine()).equals("N"))) break;
                else {
                    int n = Integer.parseInt(s);
                    sum += n;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(sum);
    }
}
