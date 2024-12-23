package com.javarush.task.task06.task0615;

/* 
Феншуй и статики
Переставь один модификатор static, чтобы пример скомпилировался.
*/

public class Solution {

    public static int A = 5;//add static
    public int B = 2;
    public int C = A * B;//remove static

    public static void main(String[] args) {
        A = 15;
    }
}

