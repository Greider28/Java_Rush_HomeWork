package com.javarush.task.task11.task1107;

/* 
Наш кот слишком публичен!
Скрой внутренние переменные класса Cat, к которым есть доступ с помощью методов.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        public String name;//private
        public int age;//private
        public int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
