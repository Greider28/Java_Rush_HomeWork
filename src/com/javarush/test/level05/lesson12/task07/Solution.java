package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
Текущая реализация: Программа считывает два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа считывает пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int minimum = min(a, b);// nedd to chane ti line --int minimum = min(a, b, c, d, e);--

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b) {//need to change to method below with 5 incoming params
        return a < b ? a : b;
    }

  public static int min(int a, int b, int c, int d, int e) {
        if (a <= b && a <= c && a <= d && a <= e){
            return a;
        } else if (b <= a && b <= c && b <= d && b <= e) {
            return b;
        } else if (c <= a && c <= b && c <= d && c <= e) {
            return c;
        } else if (d <= a && d <= c && d <= b && d <= e) {
            return d;
        } else {
            return e;
        }

    }
}
