package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как-то средненько
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое. Если все числа равны, вывести любое из них.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if ((a <= b && b <= c) || (c <= b && b <= a)){
            System.out.println(b);
        }
        else if ((b <= a && a <= c) || (c <= a && a <= b)){
            System.out.println(a);
        }
        else {
            System.out.println(c);
        }

    }
}
