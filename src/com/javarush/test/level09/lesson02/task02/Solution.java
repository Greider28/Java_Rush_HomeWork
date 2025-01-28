package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        //напишите тут ваш код
      StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();
        /*
        getStackTrace возвращает массив элементов StackTraceElement. Этот массив содержит стек-трейс вызова. 
        Индекс [2] в этом массиве соответствует методу стоящему "выше" по стек-трейсу, индекс [1]  - методу, в котором вызывается getStackTrace в текущий момент, [0] - самому методу getStackTrace.
         */
    }

    public static String method2() {
        method3();
        //напишите тут ваш код
      StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();
    }

    public static String method3() {
        method4();
        //напишите тут ваш код
      StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();
    }

    public static String method4() {
        method5();
        //напишите тут ваш код
      StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();
    }

    public static String method5() {
        //напишите тут ваш код
      StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();
    }
}
