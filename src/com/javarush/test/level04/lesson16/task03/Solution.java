package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
Вводить с клавиатуры числа. Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу. -1 должно учитываться в сумме.
Подсказка: один из вариантов решения этой задачи, использовать конструкцию:
while (true) {
    int number = считываем число;
    if (проверяем, что number -1)
        break;
}
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        while (true) {
            int num = Integer.parseInt(reader.readLine());
            count += num;
            if (num == -1){
                break;
            }
        }
        System.out.println(count);

    }
}
