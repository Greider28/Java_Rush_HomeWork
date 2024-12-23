package com.javarush.task.task06.task0616;

/* 
Минимальное число статиков
Расставь минимальное количество static-ов, чтобы код начал работать, и программа успешно завершилась.
*/

public class Solution {
    public static int step;//add static

    public static void main(String[] args) {
        method1();
    }

    public static void method1() {//add static
        method2();
    }

    public static void method2() {//add static
        new Solution().method3();
    }

    public void method3() {
        method4();
    }

    public void method4() {
        step++;
        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
        if (step > 1) {
            return;
        }
        main(null);
    }
}
