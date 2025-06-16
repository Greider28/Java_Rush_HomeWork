package com.javarush.task.task14.task1413;

public class Keyboard implements CompItem {
    public String getName(){
        Class<?> objectClass = this.getClass();
        return objectClass.getSimpleName(); // Получаем простое имя класса
    }
}
