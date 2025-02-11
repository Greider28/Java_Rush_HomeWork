package com.javarush.task.task09.task0925;

/* 
Статики не на своем месте
Расставь модификаторы static так, чтобы пример скомпилировался.
*/

public class Solution {
    public static int A = 5;// add static
    public static int B = 2 * A;// add static
    public int C = A * B;
    public static int D = A * B;// add static

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.A = 5;

        Solution.D = 5;
    }

    public int getA() {
        return A;
    }

}
