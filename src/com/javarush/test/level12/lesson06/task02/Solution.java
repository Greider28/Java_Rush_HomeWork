package com.javarush.task.task12.task1212;

/* 
«Исправь код», часть 1
Исправь код, чтобы программа компилировалась.
Подсказка: метод getChild должен остаться абстрактным.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static class Pet {//public static abstract class Pet
        public String getName() {
            return "Я - котенок";
        }

        public abstract Pet getChild();
    }
}
