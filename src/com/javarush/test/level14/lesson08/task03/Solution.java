package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
Давай напишем программу, которая определит, чем заняться тому или иному человеку. Для этого нужно: 
Ввести [в цикле] с клавиатуры несколько строк (ключей). Строки (ключи) могут быть такими: "user", "loser", "coder", "proger". Ввод окончен, когда строка не совпадает ни с одной из выше указанных.
Для каждой введенной строки нужно: 
Создать соответствующий объект [см. Person.java], например, для строки "user" нужно создать объект класса User.
Передать этот объект в метод doWork.
Написать реализацию метода doWork, который: 
Вызывает метод live() у переданного объекта, если этот объект (person) имеет тип User.
Вызывает метод doNothing(), если person имеет тип Loser.
Вызывает метод writeCode(), если person имеет тип Coder.
Вызывает метод enjoy(), если person имеет тип Proger.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        while (true)
        {
            //создаем объект, пункт 2
            key = reader.readLine();
            if (key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("proger")) {

                if (key.equals("user")) {
                    person = new Person.User();
                } else if (key.equals("loser")) {
                    person = new Person.Loser();
                } else if (key.equals("coder")) {
                    person = new Person.Coder();
                } else if (key.equals("proger")) {
                    person = new Person.Proger();
                }

                doWork(person); //вызываем doWork
            } else {
                break;
            }

        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User){
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser){
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder){
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        }
    }
}
