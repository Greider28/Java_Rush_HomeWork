package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
Написать программу, которая вводит с клавиатуры строку текста. 
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //напишите тут ваш код
      char[] stringArray = string.toCharArray();
        stringArray[0] = Character.toUpperCase(stringArray[0]);
        for (int i = 0; i < stringArray.length; i++){
            char oneChar = stringArray[i];
            if (oneChar == ' '){
                stringArray[i + 1] = Character.toUpperCase(stringArray[i + 1]);
            }
        }
        String stringArrayStr = new String(stringArray);
        System.out.println(stringArrayStr);

        /* alternative solution
        String result = "";
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = (i == 0 || chars[i - 1] == ' ') ? Character.toUpperCase(chars[i]) : chars[i];
            result += character;
        }
        System.out.println(result);
        */
    }
}
