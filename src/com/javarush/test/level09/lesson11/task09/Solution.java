package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
Есть класс кот - Cat, с полем "имя" (String).
Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот". 
Получить из Map множество(Set) всех котов и вывести его на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
      Map<String, Cat> map = new HashMap<>();
        Cat cat1 = new Cat("name1");
        map.put(cat1.name, cat1);
        Cat cat2 = new Cat("name2");
        map.put(cat2.name, cat2);
        Cat cat3 = new Cat("name3");
        map.put(cat3.name, cat3);
        Cat cat4 = new Cat("name4");
        map.put(cat4.name, cat4);
        Cat cat5 = new Cat("name5");
        map.put(cat5.name, cat5);
        Cat cat6 = new Cat("name6");
        map.put(cat6.name, cat6);
        Cat cat7 = new Cat("name7");
        map.put(cat7.name, cat7);
        Cat cat8 = new Cat("name8");
        map.put(cat8.name, cat8);
        Cat cat9 = new Cat("name9");
        map.put(cat9.name, cat9);
        Cat cat10 = new Cat("name10");
        map.put(cat10.name, cat10);

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
      Set<Cat> set = new HashSet<>();
        for (Map.Entry<String, Cat> pair: map.entrySet()){
            set.add(pair.getValue());
        }

        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
