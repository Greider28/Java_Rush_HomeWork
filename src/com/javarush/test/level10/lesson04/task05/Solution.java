package com.javarush.task.task10.task1005;

/* 
Задача №5 на преобразование целых типов
Правильно расставь операторы приведения типа, чтобы получился ответ: c = 256.
int a = (byte)44; 
int b = (byte)300;
short c = (byte)(b - a);
*/

public class Solution {
    public static void main(String[] args) {
        int a = (byte) 44;
        int b = (short) 300;
        short c = (short) (b - a);
        System.out.println(c);
    }
}
