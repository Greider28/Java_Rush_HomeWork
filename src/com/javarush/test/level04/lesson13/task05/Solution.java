package com.javarush.task.task04.task0439;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Письмо счастья
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: <имя> любит меня.
Пример вывода на экран для имени Света: 
Света любит меня. 
Света любит меня. 
Света любит меня. 
Света любит меня. 
Света любит меня. 
Света любит меня. 
Света любит меня. 
Света любит меня. 
Света любит меня. 
Света любит меня.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " любит меня.");

        }

    }
}
