package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        List<String> objects = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String link = reader.readLine();
        String params = link.substring(link.indexOf('?') + 1);

        while (params.contains("&")) {
            String pair = params.substring(0, params.indexOf('&'));
            params = params.replaceFirst(pair + "&", "");

            String param = pair.contains("=") ? pair.substring(0, pair.indexOf('=')) : pair;
            System.out.print(param);
            System.out.println(" ");

            if (param.equals("obj")) objects.add(pair.substring(pair.indexOf("=") + 1));
        }
        String param = params.contains("=") ? params.substring(0, params.indexOf('=')) : params;
        System.out.println(param);

        if (param.equals("obj")) objects.add(params.substring(param.indexOf("=") + 1));

        if (objects.size() > 0) {
            for (String string : objects) {
                try {
                    double odouble = Double.parseDouble(string);
                    alert(odouble);
                }
                catch (Exception e) {
                    alert(string);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
