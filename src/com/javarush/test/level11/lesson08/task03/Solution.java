package com.javarush.task.task11.task1108;

/* 
Неприступный кот
Скрой все внутренние переменные класса Cat, а также методы, позволяющие менять внутреннее состояние объектов класса Cat.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        public String name;//private
        public int age;//private
        public int weight;//private

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {//private
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {//private
            this.age = age;
        }
    }
}
