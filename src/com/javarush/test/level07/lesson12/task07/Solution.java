package com.javarush.task.task07.task0725;

/* 
Переставь один модификатор static, чтобы код скомпилировался
*/

public class Solution {
    public final int A = 5;//need to add static
    public final static int B = 2;
    public final static int C = A * B;

    public static void main(String[] args) {
    }

    public static int getValue() {//need to remove static
        return C;
    }
}
