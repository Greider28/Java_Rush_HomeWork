package com.javarush.task.task10.task1010;

/* 
Правильный ответ: d = 1.0
Добавь в метод main() одну операцию по преобразованию типа, чтобы получался ответ: d = 1.0.
*/

public class Solution {
    public static void main(String[] args) {
        int a = 257;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = a + b / c / e;//double d = (byte)a + b / c / e;

        System.out.println(d);
    }
}
