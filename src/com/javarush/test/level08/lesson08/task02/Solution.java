package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
       Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 20; i++){
            set.add(i);
        }
        return set;

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
      Set<Integer> set2 = new HashSet<Integer>(set);
        for (Integer i : set2){
            if (i > 10) set.remove(i);
        }
        return set;

    }

    public static void main(String[] args) {

    }
}
