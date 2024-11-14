package com.javarush.task.task04.task0432;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Хорошего много не бывает
Ввести с клавиатуры строку и число N больше 0. Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.
Пример ввода: абв 2
Пример вывода: абв абв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int n = Integer.parseInt(reader.readLine());
        while (n > 0){
            System.out.println(s);
            n--;
        }

    }
}
