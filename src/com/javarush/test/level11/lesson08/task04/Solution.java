package com.javarush.task.task11.task1109;

/* 
Как кошка с собакой
Скрой все внутренние переменные класса Cat и Dog. Также скрой все методы, кроме тех, с помощью которых эти классы взаимодействуют друг с другом.
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat("Vaska", 5);
        Dog dog = new Dog("Sharik", 4);

        cat.isDogNear(dog);
        dog.isCatNear(cat);
    }
}

class Cat {
    public String name;//private
    public int speed;//private

    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {//private
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isDogNear(Dog dog) {
        return this.speed > dog.getSpeed();
    }
}

class Dog {
    public String name;//private
    public int speed;//private

    public Dog(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {//private
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isCatNear(Cat cat) {
        return this.speed > cat.getSpeed();
    }
}
