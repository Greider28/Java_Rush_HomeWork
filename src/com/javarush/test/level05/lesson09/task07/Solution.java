package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
Изучи класс Circle. Напиши максимальное количество конструкторов с разными аргументами.
Подсказка: не забудь про конструктор по умолчанию.
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код
    public Circle(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    };
    public Circle(double x, double y){
        this(x, y, 10);
    };
    public Circle(double radius){
        this(25, 50, radius);
    };
    public Circle(){
        this(5,7,9);
    };

    public static void main(String[] args) {

    }
}
