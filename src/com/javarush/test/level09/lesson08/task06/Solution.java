package com.javarush.task.task09.task0918;

/* 
Все свои, даже исключения
Есть четыре класса MyException, MyException2, MyException3, MyException4.
Унаследуй классы так, чтобы у тебя появилось любые два checked исключения и любые два unchecked исключения.
*/

public class Solution {
    /* code from the task
    public static void main(String[] args) {
    }

    static class MyException {
    }

    static class MyException2 {
    }

    static class MyException3 {
    }

    static class MyException4 {
    }
    */
    //my code
    public static void main(String[] args) throws Exception{
    }

    static class MyException extends Exception {
    }

    static class MyException2 extends MyException {
    }

    static class MyException3 extends RuntimeException {
    }

    static class MyException4 extends MyException3 {
    }
}
