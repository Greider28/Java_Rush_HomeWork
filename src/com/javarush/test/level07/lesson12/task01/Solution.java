package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке. Каждый элемент - с новой строки. Использовать только цикл for.  
Подсказка: Не забудь импортировать класс: java.util.ArrayList;
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
      ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            nums.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = nums.size() - 1; i >= 0; i--){
            System.out.println(nums.get(i));
        }
    }
}

