package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде:
"May is the 5 month". 
Используй коллекции.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String monthStr = reader.readLine();
        ArrayList<String> months = new ArrayList<String>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
        int num = 0;
        for (int i = 0; i < months.size(); i++){
            if (months.get(i).equals(monthStr)){
                num = i + 1;
            }
        }
        System.out.println(monthStr + " is the " + num + " month");
    }
}
