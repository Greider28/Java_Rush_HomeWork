package com.javarush.task.task08.task0825;

/* 
Модификатор запутался
Переставь один модификатор static, чтобы пример скомпилировался.
*/

public class Solution {
    public static int A = 5;//add static
    public static int B = 2;

    public int C = A * B;
    public static int D = B * A;

    public static void main(String[] args) {
    }

    public int getValue() {//remove static
        return D;
    }

    public int getValue2() {
        return C;
    }
}
