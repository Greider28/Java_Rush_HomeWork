package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
      private String name;
        private int age;
        private int weight;
        private int height;
        private String secondName;
        private String city;

        public Human(String name, int age, int weight, int height, String secondName, String city){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.secondName = secondName;
            this.city = city;
        }
        public Human(String name, int age, int weight, String secondName, int height){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.secondName = secondName;
            this.city = null;
        }
        public Human(String name, int age, int weight, int height, String city){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.secondName = null;
            this.city = city;
        }
        public Human(String name, String secondName, String city, int age, int weight){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = 180;
            this.secondName = secondName;
            this.city = city;
        }
        public Human(int age, String name, int height, String secondName, String city){
            this.name = name;
            this.age = age;
            this.weight = 50;
            this.height = height;
            this.secondName = secondName;
            this.city = city;
        }
        public Human(String name, int weight, int height, String secondName, String city){
            this.name = name;
            this.age = 25;
            this.weight = weight;
            this.height = height;
            this.secondName = secondName;
            this.city = city;
        }
        public Human(String name, int age, int weight, int height){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.secondName = null;
            this.city = null;
        }
        public Human(String name, String secondName, String city){
            this.name = name;
            this.age = 25;
            this.weight = 50;
            this.height = 180;
            this.secondName = secondName;
            this.city = city;
        }
        public Human(int age, int weight, int height, String secondName, String city){
            this.name = "Somebody";
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.secondName = secondName;
            this.city = city;
        }
        public Human(String name){
            this.name = name;
            this.age = 25;
            this.weight = 50;
            this.height = 180;
            this.secondName = null;
            this.city = null;
        }
    }
}
