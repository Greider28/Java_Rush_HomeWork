package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список. Переставить M первых строк в конец списка. Вывести список на экран, каждое значение с новой строки.
Примечание: запрещено создавать больше одного списка.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
      int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < n; i++){
            strings.add(reader.readLine());
        }
        for (int i = 0; i < m; i++){
            String tmp = strings.get(i);
            strings.add(tmp);
        }
        String breakdown = strings.get(m);
        for (int i = 0; i < m; ){
            if (strings.get(i).equals(breakdown)){
                break;
            } else {
                String tmp = strings.get(i);
                strings.remove(i);
            }
        }
        for (int i = 0; i < strings.size(); i++){
            System.out.println(strings.get(i));
        }
    }
}
