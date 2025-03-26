package com.javarush.task.task11.task1106;

/* 
Скрытный инкапсулированный кот
Скрой все внутренние переменные класса Cat.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        public String name;//private
        public int age;//private
        public int weight;//private

        public Cat() {
        }

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }
}
