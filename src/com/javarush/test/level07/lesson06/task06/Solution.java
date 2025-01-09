package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры. 
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная. Если таких строк несколько, то должны быть учтены самые первые из них. 
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
      ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i= 0; i < 10; i++){
            list.add(reader.readLine());
        }
        String minString = list.get(0);
        String maxString = list.get(0);
        int minPosition = 0, maxPosition = 0;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).length() < minString.length()){
                minString = list.get(i);
                minPosition = i;
            }
        }
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).length() > maxString.length()){
                maxString = list.get(i);
                maxPosition = i;
            }
        }
        String result = (minPosition < maxPosition) ? list.get(minPosition) : list.get(maxPosition);
        System.out.println(result);
    }
}
