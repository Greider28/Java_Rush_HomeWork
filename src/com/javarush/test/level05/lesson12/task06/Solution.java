package com.javarush.task.task05.task0530;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Шеф, что-то не пашет
Задача: Программа считывает два числа с клавиатуры и выводит их сумму на экран.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = reader.readLine();//need to change to line --int a = Integer.parseInt(reader.readLine());--
        int b = reader.read();//need to change to line --int b = Integer.parseInt(reader.readLine());--

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
