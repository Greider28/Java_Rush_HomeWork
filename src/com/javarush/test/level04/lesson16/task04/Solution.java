package com.javarush.task.task04.task0443;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как назвали, так назвали
Ввести с клавиатуры строку name. Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст: "Меня зовут name. Я родился d.m.y"
Пример вывода: Меня зовут Вася. Я родился 15.2.1988
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int y = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        System.out.println("Меня зовут " + name + ".");
        System.out.printf("Я родился %d.%d.%d\n", d, m, y);

        /*
        пример форматированного вывода таблицей
        System.out.printf("%-10s %-10s %-10s\n", "NAME", "AGE", "CITY");
        System.out.printf("%-10s %-10s %-10s\n", "John", "23", "New York");
        System.out.printf("%-10s %-10s %-10s\n", "Amy", "31", "Los Angeles");
        */

    }
}
